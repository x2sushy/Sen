package character;

public class MC extends Character{
    public MC(int health, String name) {
        super(health, name);
    }

    public static MC createMC(int health, String name) {
        return new MC(health, name);
    }


}
