import character.Character;


import java.util.ArrayList;

public class Location {

    private String id;
    private String name;
    private ArrayList<Character> characters;

    public Location(Character characters, String name) {
        this.name = name;
        this.characters = new ArrayList<>();
        this.characters.add(characters);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(ArrayList<Character> characters) {
        this.characters = characters;
    }
}
