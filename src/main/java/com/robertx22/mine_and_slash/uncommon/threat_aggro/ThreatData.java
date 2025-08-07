package com.robertx22.mine_and_slash.uncommon.threat_aggro;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ThreatData {
    public UUID highestKey = null;
    public HashMap<UUID, Integer> map = new HashMap<>();

    public void addThreat(LivingEntity threatCreatorEntity, Mob mob, int threat) {
        UUID uuid = threatCreatorEntity.getUUID();
        var cur = map.getOrDefault(uuid, 0);
        map.put(uuid, cur + threat);
        updateMobTargetWithHighestThreat(mob, threatCreatorEntity, uuid);
    }

    private void updateMobTargetWithHighestThreat(Mob mob, LivingEntity threatCreatorEntity, UUID key) {
        if (
            highestKey == null ||
            map.get(key) > map.get(highestKey) ||
            highestKey.equals(key)
        ) {
            highestKey = key;
            setTargetTo(mob, threatCreatorEntity);
            return;
        }

        ServerLevel level = (ServerLevel) mob.level();
        while (!map.isEmpty()) {
            Entity threat = level.getEntity(highestKey);
            if (threat != null && threat.isAlive()) {
                break;
            }
            map.remove(highestKey);

            if (map.isEmpty()) {
                highestKey = null;
                return;
            }

            highestKey = map.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue)).get().getKey();
        }
    }

    private static void setTargetTo(Mob mob, LivingEntity threatCreatorEntity) {
        if (mob.getTarget() != threatCreatorEntity) {
            mob.setTarget(threatCreatorEntity);
        }
    }
}
