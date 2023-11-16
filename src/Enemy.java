public class Enemy {
    private Floors floor;

    public Enemy(Floors floors) {
        floor = floors;
    };


    public void standard() {
        int enemyHealth = 100 + (2 * floor.getFloor() );
        double damage = 1 + 0.5 * floor.getFloor();
    }

    public void boss() {

    }
}
