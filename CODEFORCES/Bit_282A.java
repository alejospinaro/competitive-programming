import java.util.Scanner;

public class Bit_282A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x = 0, n;
        n = keyboard.nextInt();

        for (int i = 0; i < n; i++) {
            String bit = keyboard.next();
            if (bit.equals("X++") || bit.equals("++X")) {
                x += 1;
            } else {
                x -= 1;
            }
        }
        System.out.println(x);
    }
}
