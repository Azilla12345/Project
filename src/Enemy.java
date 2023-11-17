public class Enemy {
    private Floors floor;
    double damage;

    public Enemy(Floors floors) {
        floor = floors;
    };


    public void standard() {
        int enemyHealth = 100 + (2 * floor.getFloor() );
        damage = 1 + 0.5 * floor.getFloor();
    }

    public double attack() {
        return damage;
    }

    public void boss() {

    }
}
