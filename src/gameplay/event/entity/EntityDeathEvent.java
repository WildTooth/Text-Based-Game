package gameplay.event.entity;

import gameplay.entity.LivingEntity;

public class EntityDeathEvent extends EntityEvent {

    public EntityDeathEvent(LivingEntity what) {
        super(what);
    }

    public LivingEntity getEntity() {
        return (LivingEntity)this.entity;
    }
}
