import java.util.Scanner;

public class WayTooLongWords_71A {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        String word = "";

        n = keyboard.nextInt();

        for(int i=0;i<n;i++){
            word = keyboard.next();

            if(word.length() > 10){
                int middleCount = word.length() - 2;
                word = word.charAt(0) + String.valueOf(middleCount) + word.charAt(word.length() - 1);
            }
             System.out.println(word);
        }
    }
}