

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

}