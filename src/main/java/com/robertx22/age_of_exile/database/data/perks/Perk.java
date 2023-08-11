package com.robertx22.age_of_exile.database.data.perks;

import com.robertx22.age_of_exile.database.OptScaleExactStat;
import com.robertx22.age_of_exile.database.data.stats.Stat;
import com.robertx22.age_of_exile.database.registry.ExileRegistryTypes;
import com.robertx22.age_of_exile.mmorpg.SlashRef;
import com.robertx22.age_of_exile.saveclasses.gearitem.gear_bases.ITooltipList;
import com.robertx22.age_of_exile.saveclasses.gearitem.gear_bases.TooltipInfo;
import com.robertx22.age_of_exile.uncommon.interfaces.IAutoLocName;
import com.robertx22.age_of_exile.uncommon.localization.Words;
import com.robertx22.age_of_exile.uncommon.utilityclasses.ClientTextureUtils;
import com.robertx22.library_of_exile.registry.ExileRegistryType;
import com.robertx22.library_of_exile.registry.IAutoGson;
import com.robertx22.library_of_exile.registry.JsonExileRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class Perk implements JsonExileRegistry<Perk>, IAutoGson<Perk>, ITooltipList, IAutoLocName {
    public static Perk SERIALIZER = new Perk();

    public PerkType type;
    public String id;
    public String icon = "";
    public String one_kind = null;
    public transient String locname = "";
    public boolean is_entry = false;

    public List<OptScaleExactStat> stats = new ArrayList<>();


    transient ResourceLocation cachedIcon = null;


    // todo
    public int getMaxLevel() {
        return 1;
    }

    public ResourceLocation getIcon() {
        if (cachedIcon == null) {
            ResourceLocation id = new ResourceLocation(icon);
            if (ClientTextureUtils.textureExists(id)) {
                cachedIcon = id;
            } else {
                cachedIcon = Stat.DEFAULT_ICON;
            }
        }
        return cachedIcon;
    }

    @Override
    public int Weight() {
        return 1000;
    }

    @Override
    public List<MutableComponent> GetTooltipString(TooltipInfo info) {
        List<MutableComponent> list = new ArrayList<>();

        try {

            if (this.type != PerkType.STAT) {
                list.add(locName().withStyle(type.format));
            }

            //   info.statTooltipType = StatTooltipType.NORMAL;

            stats.forEach(x -> list.addAll(x.GetTooltipString(info)));


            if (this.one_kind != null) {
                list.add(Component.literal("Can only have one Perk of this type: ").withStyle(ChatFormatting.GREEN));

                list.add(Component.translatable(SlashRef.MODID + ".one_of_a_kind." + one_kind).withStyle(ChatFormatting.GREEN));
            }


            if (this.type == PerkType.MAJOR) {

                list.add(Component.literal("Game changer talent.").withStyle(ChatFormatting.RED));
            }

            //list.add(ExileText.newLine().get());

            list.add(Words.PressAltForStatInfo.locName()
                    .withStyle(ChatFormatting.BLUE));

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    @Override
    public AutoLocGroup locNameGroup() {
        return AutoLocGroup.Talents;
    }

    @Override
    public String locNameLangFileGUID() {
        return SlashRef.MODID + ".talent." + id;
    }

    @Override
    public String locNameForLangFile() {
        return locname;
    }

    public enum Connection {
        LINKED, BLOCKED, POSSIBLE
    }

    public enum PerkType {
        STAT(2, 24, 24, 39, ChatFormatting.WHITE),
        SPECIAL(3, 28, 28, 77, ChatFormatting.LIGHT_PURPLE),
        MAJOR(1, 33, 33, 1, ChatFormatting.RED),
        START(4, 35, 35, 115, ChatFormatting.YELLOW);
        // SPELL_MOD(5, 26, 26, 153, ChatFormatting.BLACK);

        int order;

        public int width;
        public int height;
        private int xoff;
        public ChatFormatting format;

        PerkType(int order, int width, int height, int xoff, ChatFormatting format) {
            this.order = order;
            this.width = width;
            this.height = height;
            this.xoff = xoff;
            this.format = format;
        }

        public int getXOffset() {
            return xoff;
        }

    }


    public PerkType getType() {
        return type;
    }


    @Override
    public Class<Perk> getClassForSerialization() {
        return Perk.class;
    }

    @Override
    public ExileRegistryType getExileRegistryType() {
        return ExileRegistryTypes.PERK;
    }

    @Override
    public String GUID() {
        return id;
    }
}
