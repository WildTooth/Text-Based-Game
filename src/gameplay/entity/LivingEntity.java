package gameplay.entity;

public interface LivingEntity extends Entity, Damageable {

    int getLastDamage();

    void setLastDamage();

    Player getKiller();


}
