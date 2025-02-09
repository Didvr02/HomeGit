import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperience() {
        return experience;
    }

    public void addExperience(int experience) {
        this.experience += experience;
    }

    public void addItem(String item) {
        inventory.add(item);
    }

    public List<String> getInventory() {
        return inventory;
    }
}