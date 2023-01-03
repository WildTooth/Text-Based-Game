package gameplay.fights;

import gameplay.entity.LivingEntity;
import gameplay.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Fight {

    private final List<LivingEntity> enemies;
    private final Player player;

    public Fight(Player player, LivingEntity... enemies) {
        this.player = player;
        this.enemies = new ArrayList<>();
        for(LivingEntity enemy : enemies) {
            this.enemies.add(enemy);
        }
    }

    public List<LivingEntity> getEnemies() {
        return enemies;
    }

    public Player getPlayer() {
        return player;
    }
    
}
