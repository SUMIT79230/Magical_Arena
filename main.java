import java.util.Scanner;

public class main {
    public static Player createPlayer(Scanner scanner, String name) {
        System.out.println("Enter " + name + "'s attributes");
        System.out.print("Health: ");
        int health = scanner.nextInt();

        System.out.print("Strength: ");
        int strength = scanner.nextInt();

        System.out.print("Attack: ");
        int attack = scanner.nextInt();
        
        return new Player(health, strength, attack, name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player playerA = createPlayer(scanner, "Player A");
        Player playerB = createPlayer(scanner, "Player B");

        Match match = new Match(playerA, playerB);
        match.start();

        scanner.close();
    }
}
