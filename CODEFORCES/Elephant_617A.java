import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        keyboard.close();

        int steps = 0;

        while (x > 0) {
            if (x >= 5) {
                x -= 5;
            } else if (x == 4) {
                x -= 4;
            } else if (x == 3) {
                x -= 3;
            } else if (x == 2) {
                x -= 2;
            } else {
                x -= 1;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
