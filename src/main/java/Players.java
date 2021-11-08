import java.util.Scanner;

public class Players {

    private final char symbol;

    Players (char symbol) {
      this.symbol = symbol;
    }

    private boolean isAdded(char symbol) {
        return symbol >= '1' && symbol <= '9';
    }

    public int[] indexes (char symbol) {
        int[] position = new int[2];
        char count = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (count == symbol) {
                    position[0] = i;
                    position[1] = j;
                    break;
                }
                count++;
            }
        }

        return position;
    }

    public char input (char symbol) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Turn " + symbol);
        char result;

        do {
            System.out.println("Input one number out of displayed numbers");
            result = sc.nextLine().charAt(0);
        } while (!isAdded(result));

        return result;
    }

}
