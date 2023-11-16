import java.util.Scanner;

public class projectRunner {
    Scanner myScanner = new Scanner(System.in);
    int players;
    int action;

    Floors floor = new Floors(0);

    boolean answer = false;
    boolean gameRunning = true;
    Player player1 = new Player();
    Player player2 = new Player();
    public void runGame() {
        System.out.print("Single player or 2 players?(1 or 2): ");
        players = myScanner.nextInt();
        while (!answer) {
            if (players == 1) {
                System.out.println("Single player it is then");
                answer = true;
            } else if (players == 2) {
                System.out.println("2 Players");
                answer = true;
            } else {
                System.out.print("Invalid number, please try again: ");
                players = myScanner.nextInt();
            }
        }
        myScanner.nextLine();

        System.out.print("What do you call yourself?: ");
        player1.setName(myScanner.nextLine());
        System.out.println("Player 1: " + player1.name);

        if (players == 2) {
            System.out.print("Player 2, what do you call yourself?: ");
            player2.setName(myScanner.nextLine());
            System.out.println("Player 2: " + player2.name);
        }


        int moves = 1;
        boolean inRound = false;
        int enemies = 0;


        while (gameRunning) {
            if (inRound) {
                if ((moves == 5) || (player1.health == 0)) {
                    gameRunning = false;
                } else {
                    while (enemies != (int)(Math.random()*3) + 1) {
                        Enemy enemy = new Enemy(floor);
                    }
                    System.out.print("Pick action: ");
                    action = myScanner.nextInt();
                    player1.action(action);
                    moves++;
                }
            } else {
                floor.addFloor();
                moves = 0;
                inRound = true;
            }
        }

        System.out.println("You got to floor " + floor.getFloor());



    }

}
