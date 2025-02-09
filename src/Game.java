public class Game {
    private Player player;
    private LevelManager levelManager;

    public Game(String playerName) {
        this.player = new Player(playerName, 100);
        this.levelManager = new LevelManager();
    }

    public void play() {
        while (levelManager.getLevel() <= 3 && player.getHealth() > 0) {
            System.out.println("=== Level " + levelManager.getLevel() + " ===");
            // Fight enemies
            for (Enemy enemy : levelManager.getEnemies()) {
                System.out.println(player.getName() + " fights " + enemy.getName() + "!");
                player.setHealth(player.getHealth() - enemy.attack());
                player.addExperience(enemy.getExperienceReward());
                System.out.println("Health: " + player.getHealth() + ", Experience: " + player.getExperience());
            }
            // Pick up items
            for (Item item : levelManager.getItems()) {
                System.out.println(player.getName() + " picks up " + item.getName() + ".");
                item.applyEffect(player);
                player.addItem(item.getName());
                System.out.println("Inventory: " + player.getInventory());
            }
            // Advance level
            if (player.getHealth() > 0 && levelManager.getLevel() < 3) {
                levelManager.advanceLevel();
            }
        }
        // End game
        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has perished. Game Over.");
        } else {
            System.out.println("Congratulations, " + player.getName() + "! You completed the adventure with "
                    + player.getExperience() + " experience points!");
        }
    }
}