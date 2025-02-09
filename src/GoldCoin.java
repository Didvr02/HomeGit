public class GoldCoin implements Item {
    @Override
    public String getName() {
        return "Gold Coin";
    }

    @Override
    public void applyEffect(Player player) {
        player.addExperience(5);
    }
}
