package gameplay.event.entity;

import gameplay.entity.Entity;
import gameplay.event.Event;

public abstract class EntityEvent extends Event {
    protected Entity entity;

    public EntityEvent(Entity what) {
        this.entity = what;
    }

    public Entity getEntity() {
        return this.entity;
    }
}
