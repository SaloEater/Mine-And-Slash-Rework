package com.robertx22.age_of_exile.loot.generators;

import com.robertx22.age_of_exile.config.forge.ServerContainer;
import com.robertx22.age_of_exile.loot.LootInfo;
import com.robertx22.age_of_exile.loot.blueprints.GearBlueprint;
import com.robertx22.age_of_exile.loot.blueprints.RuneBlueprint;
import com.robertx22.age_of_exile.uncommon.enumclasses.LootType;
import net.minecraft.world.item.ItemStack;

public class RuneLootGen extends BaseLootGen<GearBlueprint> {

    public RuneLootGen(LootInfo info) {
        super(info);

    }

    @Override
    public float baseDropChance() {
        if (true) {
            return 2000;
        }
        return (float) (ServerContainer.get().RUNE_DROPRATE.get()
                .floatValue());
    }

    @Override
    public LootType lootType() {
        return LootType.Rune;
    }

    @Override
    public boolean condition() {
        return true;
    }

    @Override
    public ItemStack generateOne() {
        RuneBlueprint b = new RuneBlueprint(info.level);
        
        return b.createStack();

    }

}

