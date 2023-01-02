package gameplay.entity;

public interface Damageable extends Entity {

    /**
     * Removes health from the {@link Damageable} {@link Entity}.
     */
    void damage(int paramInt);

    /**
     * @return the health of the {@link Damageable} {@link Entity}.
     */
    int getHealth();

    /**
     * Sets the health of the {@link Damageable} {@link Entity}.
     */
    void setHealth(int paramInt);

    /**
     * @return the max health of the {@link Damageable} {@link Entity}.
     */
    int getMaxHealth();

    /**
     * Sets the max health of the {@link Damageable} {@link Entity}.
     * @param paramInt
     */
    void setMaxHealth(int paramInt);

    /**
     * Reset the max health of the {@link Damageable} {@link Entity} to its maximum value.
     */
    void resetMaxHealth();

}
