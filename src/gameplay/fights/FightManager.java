package gameplay.fights;

import gameplay.entity.LivingEntity;
import gameplay.entity.Player;

import java.util.Arrays;

public class FightManager {
    public void startFight(Fight fight) {
        final Player player = fight.getPlayer();
        final LivingEntity[] enemies = new LivingEntity[fight.getEnemies().size()];

        for (int i = 0; i < enemies.length; i++) {
            enemies[i] = fight.getEnemies().get(i);
        }

        System.out.println("Now in a fight between " + player.getDisplayName() + " and " + Arrays.toString(enemies));
    }
}
