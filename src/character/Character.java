package character;

import java.util.ArrayList;
import items.Item;

public abstract class Character {

    int health;
    String name;
    ArrayList<Item> loot;

    public Character(int health, String name) {
        this.health = health;
        this.name = name;
    }
    public void attack(){

    }
}
