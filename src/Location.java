import character.Character;

import java.util.ArrayList;

public class Location {

    private String name;
    private ArrayList<Character> characters;

    public Location(Character characters, String name) {
        this.name = name;
        this.characters = new ArrayList<>();
        this.characters.add(characters);
    }

}
