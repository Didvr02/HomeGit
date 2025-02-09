public class MagicScroll implements Item {
    @Override
    public String getName() {
        return "Magic Scroll";
    }

    @Override
    public void applyEffect(Player player) {
        player.addExperience(15);
    }
}