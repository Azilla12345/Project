

public class Player {
    int health = 100;
    boolean guardUp = false;
    String name = "";

    public void player() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void attack() {
        System.out.print(name + " does " + (int)(Math.random()*4) + " damage!");
    }

    public void guard() {
        guardUp = true;
    }

    public void attacked(int damage) {
        if (guardUp) {
            System.out.println("Attack was blocked!");
            guardUp = false;
        } else {
            health -= damage;
            System.out.println("Attack hits with " + damage + " damage!");
        }
    }

}