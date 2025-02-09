public class Vampire implements Enemy {
    @Override
    public String getName() {
        return "Vampire";
    }

    @Override
    public int attack() {
        return 25;
    }

    @Override
    public int getExperienceReward() {
        return 50;
    }
}