package com.robertx22.age_of_exile.database.data.spells.components;

import com.robertx22.age_of_exile.aoe_data.database.spells.SummonType;
import com.robertx22.age_of_exile.database.data.spells.SpellTag;
import com.robertx22.age_of_exile.database.data.spells.spell_classes.CastingWeapon;
import com.robertx22.age_of_exile.database.data.value_calc.LeveledValue;
import com.robertx22.age_of_exile.uncommon.enumclasses.PlayStyle;

import java.util.ArrayList;
import java.util.List;

public class SpellConfiguration {

    public boolean swing_arm = true;
    public boolean apply_cast_speed_to_cd = false;
    public CastingWeapon castingWeapon = CastingWeapon.ANY_WEAPON;
    public LeveledValue mana_cost;
    public int times_to_cast = 1;
    public int charges = 0;
    public int charge_regen = 0;
    public int imbues = 0;
    public SummonType summonType = SummonType.NONE;
    public String charge_name = "";
    private int cast_time_ticks = 0;
    public int cooldown_ticks = 20;
    public PlayStyle style = PlayStyle.INT;
    public List<SpellTag> tags = new ArrayList<>();
    public boolean scale_mana_cost_to_player_lvl = false;

    public int getCastTimeTicks() {
        return cast_time_ticks;
    }

    public SpellConfiguration applyCastSpeedToCooldown() {
        this.apply_cast_speed_to_cd = true;
        return this;
    }

    public boolean usesCharges() {
        return charges > 0;
    }

    public SpellConfiguration setChargesAndRegen(String name, int charges, int ticksToRegen) {
        this.charge_regen = ticksToRegen;
        this.charges = charges;
        this.charge_name = name;
        return this;
    }


    public boolean isProjectile() {
        return tags.contains(SpellTag.projectile);
    }

    public SpellConfiguration setSwingArm() {
        this.swing_arm = true;
        return this;
    }

    public SpellConfiguration setImbue(int times) {
        this.imbues = times;
        return this;
    }

    public SpellConfiguration setSummonType(SummonType type) {
        this.summonType = type;
        return this;
    }


    public SpellConfiguration setScaleManaToPlayer() {
        this.scale_mana_cost_to_player_lvl = true;
        return this;
    }

    public static class Builder {

        public static SpellConfiguration instant(int mana, int cd) {
            SpellConfiguration c = new SpellConfiguration();
            c.cast_time_ticks = 0;
            c.mana_cost = new LeveledValue(0.5F * mana, 1F * mana);
            c.cooldown_ticks = cd;
            return c;
        }

        public static SpellConfiguration arrowSpell(int mana, int cd) {
            SpellConfiguration c = new SpellConfiguration();
            c.cast_time_ticks = 0;
            c.mana_cost = new LeveledValue(0.5F * mana, 1F * mana);
            c.cooldown_ticks = cd;
            c.swing_arm = false;
            return c;
        }

        public static SpellConfiguration nonInstant(int mana, int cd, int casttime) {
            SpellConfiguration c = new SpellConfiguration();
            c.cast_time_ticks = casttime;
            c.mana_cost = new LeveledValue(0.5F * mana, 1F * mana);
            c.cooldown_ticks = cd;
            return c;
        }

        public static SpellConfiguration multiCast(int mana, int cd, int casttime, int times) {
            SpellConfiguration c = new SpellConfiguration();
            c.times_to_cast = times;
            c.cast_time_ticks = casttime;
            c.mana_cost = new LeveledValue(0.5F * mana, 1F * mana);
            c.cooldown_ticks = cd;
            return c;
        }

    }
}
