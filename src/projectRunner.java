import java.util.Scanner;

public class projectRunner {
    Scanner myScanner = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();
    public void runGame() {
        System.out.print("What do you call yourself?: ");
        player1.setName(myScanner.nextLine());
        System.out.print(player1.name);

    }

}
