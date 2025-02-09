public class HealthElixir implements Item {
    @Override
    public String getName() {
        return "Health Elixir";
    }

    @Override
    public void applyEffect(Player player) {
        player.setHealth(player.getHealth() + 20);
    }
}