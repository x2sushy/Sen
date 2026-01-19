package character;

import java.util.ArrayList;
import items.Item;

public abstract class Character {

    protected String id;
    protected int health;
    protected String name;
    protected ArrayList<Item> loot;

    public Character(int health, String name) {
        this.health = health;
        this.name = name;
        this.loot = new ArrayList<>();
    }
    public void attack(){

    }
}
