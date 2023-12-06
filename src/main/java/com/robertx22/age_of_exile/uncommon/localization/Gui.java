package com.robertx22.age_of_exile.uncommon.localization;

import com.robertx22.age_of_exile.mmorpg.SlashRef;
import com.robertx22.age_of_exile.uncommon.interfaces.IAutoLocName;

import java.util.Locale;

public enum Gui implements IAutoLocName {
    Favor_In_GUI(" Favor"),
    Current_Favor("Current: %1$s"),
    Loot_Exp_Multiplier("Loot/Exp Multiplier: %1$sx"),

    STATUS_BAR_LEVEL("Level %1$s %2$s%%"),
    MAINHUB_LEVEL("Level: "),
    STATS_POINTS("Points: "),
    TALENT_RESET_POINTS("Reset Points: "),
    TALENT_POINTS("Points: "),
    PASSIVE_POINTS("Passive Points: "),
    SPELL_POINTS("Spell Points: "),
    STATUS_BAR_HUGER("H: %1$s S: %2$s"),
    STATS_INFLUENCE("For each point: "),
    STAT_TOTAL("Total: "),
    SALVAGE_TIP_ON("Auto Salvage for %1$s %2$s: On"),
    SALVAGE_TIP_OFF("Auto Salvage for %1$s %2$s: Off"),
    PROF_NAME("%1$s: %2$s"),
    SPELL_DAMAGE_PROPORTION("(%1$s%% of %2$s§7)"),
    PROF_LEVEL_AND_EXP("Level: %1$s EXP: %2$s/%3$s"), AVAILABLE_SUPPORT_SLOTS("Support Slots: %1$s/5 Available");


    private String localization = "";

    Gui(String str) {
        this.localization = str;

    }

    @Override
    public AutoLocGroup locNameGroup() {
        return AutoLocGroup.Gui;
    }

    @Override
    public String locNameLangFileGUID() {
        return SlashRef.MODID + ".gui." + GUID();
    }

    @Override
    public String locNameForLangFile() {
        return localization;
    }

    @Override
    public String GUID() {
        return this.name()
                .toLowerCase(Locale.ROOT);
    }

}
