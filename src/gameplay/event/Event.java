package gameplay.event;

public abstract class Event {

    private String name;

    public String getEventName() {
        if (this.name == null) {
            this.name = this.getClass().getSimpleName();
        }

        return this.name;
    }

    public static enum Result {
        DENY,
        DEFAULT,
        ALLOW;

        private Result() {
        }
    }
}
