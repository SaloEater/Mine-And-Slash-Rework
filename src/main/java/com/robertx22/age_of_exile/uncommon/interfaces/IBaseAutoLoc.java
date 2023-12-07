package com.robertx22.age_of_exile.uncommon.interfaces;

import com.robertx22.library_of_exile.registry.IGUID;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Item;
import net.minecraft.world.effect.MobEffect;

public interface IBaseAutoLoc extends IGUID {

    enum AutoLocGroup {
        Enchants,
        Foods,
        Runes,
        StatusEffects,
        Unique_Items,
        Spells,
        Gear_Items,
        Words,
        Rarities,
        Affixes,

        Rune_Words,
        Item_Sets,
        Stats,
        Misc,

        Races,
        Talents,
        Gear_Slots,
        World_Types,
        Lootboxes,
        Chat_Messages,
        Configs,
        Currency_Items,
        Advancement_titles,
        Advancement_descriptions,
        Potions,
        Alchemy,
        OneOfAKind

    }

    default String getPrefix() {
        if (this instanceof Item) {
            return "item.";
        } else if (this instanceof Block) {
            return "block.";
        } else if (this instanceof Enchantment) {
            return "enchantment.";
        } else if (this instanceof MobEffect) {
            return "effect.";
        } else {
            return "";
        }

    }

}
