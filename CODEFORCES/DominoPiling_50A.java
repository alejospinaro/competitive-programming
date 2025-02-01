import java.util.Scanner;

public class DominoPiling_50A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int m, n, total_squares, max_dominoes = 0;

        m = keyboard.nextInt();
        n = keyboard.nextInt();
        keyboard.close();

        total_squares = m*n;

        while(total_squares >= 2){
            total_squares -= 2;
            max_dominoes ++;
        }
        System.out.println(max_dominoes);
    }
}
