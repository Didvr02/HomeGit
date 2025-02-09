public class Skeleton implements Enemy {
    @Override
    public String getName() {
        return "Skeleton";
    }

    @Override
    public int attack() {
        return 10;
    }

    @Override
    public int getExperienceReward() {
        return 20;
    }
}