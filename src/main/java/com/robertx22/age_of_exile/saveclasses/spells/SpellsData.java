package com.robertx22.age_of_exile.saveclasses.spells;

import com.robertx22.age_of_exile.database.data.spell_school.SpellSchool;
import com.robertx22.age_of_exile.database.data.spells.components.Spell;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class SpellsData {

    public HashMap<String, Integer> extra_lvls = new HashMap<>();
    public HashMap<String, Integer> allocated_lvls = new HashMap<>();
    public Set<String> schools = new HashSet<>();

    public void addToLevelsFromStat(String id, int num) {


        this.extra_lvls.put(id, extra_lvls.getOrDefault(id, 0) + num);
    }

    public void learnSpell(Spell spell, SpellSchool school) {

        schools.add(school.GUID());

        int current = allocated_lvls.getOrDefault(spell.GUID(), 0);
        allocated_lvls.put(spell.GUID(), current + 1);

    }


    /*
    public int getLevelOf(String id) {
        // todo


        MaxLevelProvider provider = MaxLevelProvider.get(id);
        return provider.getMaxLevel();

        // todo

        /*

        int level = allocated_lvls.getOrDefault(id, 0) + extra_lvls.getOrDefault(id, 0);

        MaxLevelProvider provider = MaxLevelProvider.get(id);

        if (provider != null) {
            if (level > provider.getMaxLevelWithBonuses()) {
                level = provider.getMaxLevelWithBonuses();
            }
        }

        return level;


    }
    */
}
