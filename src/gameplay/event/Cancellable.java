package gameplay.event;

public interface Cancellable {
    boolean isCancelled();

    void setCancelled(boolean var1);
}
