import java.util.Scanner;

public class projectRunner {
    Scanner myScanner = new Scanner(System.in);
    int players;
    boolean answer = false;
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
        System.out.println(player1.name);

        if (players == 2) {
            System.out.print("Player 2, what do you call yourself?: ");
            player2.setName(myScanner.nextLine());
            System.out.println(player2.name);
        }


    }

}
