import java.util.Scanner;

public class Watermelon_4A {
    public static void main(String[] args) {
        int w;
        Scanner input = new Scanner(System.in);
        w=input.nextInt();

        System.out.println(w % 2 == 0 && w > 2 ? "YES" : "NO" );
    }
}
