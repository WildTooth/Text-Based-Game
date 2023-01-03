package gameplay.entity;

public interface Player extends HumanEntity{
    String getDisplayName();

    void setDisplayName(String paramString);

    void giveExp(int paramInt);

    void giveExpLevels(int paramInt);

    float getExp();

    void setExp(float paramFloat);

    int getLevel();

    void setLevel(int paramInt);

    int getTotalExperience();

    void setTotalExperience(int paramInt);
}
