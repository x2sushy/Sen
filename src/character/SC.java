package character;

public class SC extends Character{

    private final boolean isFriendly;

    public SC(int health, String name, boolean isFriendly) {
        super(health, name);
        this.isFriendly = isFriendly;
    }
}
