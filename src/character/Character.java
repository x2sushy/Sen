package character;

import java.util.ArrayList;
import items.Item;

public abstract class Character {

    int health;
    String name;
    boolean isFriendly;
    ArrayList<Item> loot;

    public Character(int health, String name, boolean isFriendly) {
        this.health = health;
        this.name = name;
        this.isFriendly = isFriendly;
    }
    public void attack(){

    }
}
