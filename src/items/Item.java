package items;

public abstract class Item {

    protected String id;
    protected String name;
    protected int damage;

    public abstract boolean use();
}
