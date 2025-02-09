public class Zombie implements Enemy {
    @Override
    public String getName() {
        return "Zombie";
    }

    @Override
    public int attack() {
        return 15;
    }

    @Override
    public int getExperienceReward() {
        return 30;
    }
}
