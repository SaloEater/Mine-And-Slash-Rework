package com.robertx22.age_of_exile.database.data.game_balance_config;

import com.robertx22.age_of_exile.database.data.MinMax;
import com.robertx22.age_of_exile.database.data.level_ranges.LevelRange;
import com.robertx22.age_of_exile.database.registrators.LevelRanges;
import com.robertx22.age_of_exile.database.registry.ExileRegistryTypes;
import com.robertx22.library_of_exile.registry.Database;
import com.robertx22.library_of_exile.registry.ExileRegistryType;
import com.robertx22.library_of_exile.registry.IAutoGson;
import com.robertx22.library_of_exile.registry.JsonExileRegistry;

import java.util.HashMap;

public class GameBalanceConfig implements JsonExileRegistry<GameBalanceConfig>, IAutoGson<GameBalanceConfig> {

    public static GameBalanceConfig SERIALIZER = new GameBalanceConfig();

    public String id = "game_balance";
    public static String ID = "game_balance";

    public static GameBalanceConfig get() {
        return (GameBalanceConfig) Database.getRegistry(ExileRegistryTypes.GAME_BALANCE)
                .get(ID);
    }


    public int MAX_LEVEL = 100;
    public int levels_per_tier = 20;

    public LevelScalingConfig NORMAL_STAT_SCALING = new LevelScalingConfig(1, 0.2F, false);
    public LevelScalingConfig SLOW_STAT_SCALING = new LevelScalingConfig(1, 0.01F, true);
    public LevelScalingConfig MANA_COST_SCALING = new LevelScalingConfig(1, 0.2F, true);
    public LevelScalingConfig CORE_STAT_SCALING = new LevelScalingConfig(1, 0.05F, true);
    public LevelScalingConfig STAT_REQ_SCALING = new LevelScalingConfig(2, 2, true);

    public double TALENT_POINTS_PER_LVL = 1;
    public double STAT_POINTS_PER_LEVEL = 2;
    public int CLASS_POINTS_AT_MAX_LEVEL = 10;
    public double STARTING_TALENT_POINTS = 1;


    // this is kinda cursed but will probably work
    public int getTier(int lvl) {
        if (lvl == MAX_LEVEL) {
            return (lvl - 1) / levels_per_tier; // we dont want to add a new tier just for max lvl
        }
        return lvl / levels_per_tier;

    }

    public LevelRange getLevelsOfTier(int tier) {
        float multi = tier / 5F;
        int testlvl = (int) (MAX_LEVEL * multi + 1);
        return LevelRanges.allNormal().stream().filter(x -> x.isLevelInRange(testlvl)).findFirst().get();

    }

    public HashMap<MinMax, Integer> getTierMap() {

        HashMap<MinMax, Integer> tiermap = new HashMap<>();

        int tier = 0;

        int min = 0;
        int max = levels_per_tier;

        while (min <= MAX_LEVEL) {

            int addlast = min + levels_per_tier >= MAX_LEVEL ? 1000 : 0;

            tiermap.put(new MinMax(min, max + addlast), tier);
            min += levels_per_tier;
            max += levels_per_tier;
            tier++;

        }

        return tiermap;

    }

    @Override
    public ExileRegistryType getExileRegistryType() {
        return ExileRegistryTypes.GAME_BALANCE;
    }

    @Override
    public String GUID() {
        return id;
    }

    @Override
    public Class<GameBalanceConfig> getClassForSerialization() {
        return GameBalanceConfig.class;
    }

    @Override
    public int Weight() {
        return 1000;
    }
}
