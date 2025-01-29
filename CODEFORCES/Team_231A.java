import java.util.Scanner;

public class Team_231A {
    public static void main(String[] args) {
        int n, problemsContest = 0;

        Scanner keyboard = new Scanner(System.in);
        n = keyboard.nextInt();

        int votes[][] = new int[n][3];

        for(int i=0; i<votes.length; i++){
            int positive = 0;
            for(int j=0; j<votes[0].length; j++){
                votes[i][j] = keyboard.nextInt();

                if(votes[i][j] == 1){
                    positive += 1;
                }
            }

            if(positive >= 2){
                problemsContest += 1;
            }
        }

        System.out.println(problemsContest);
    }
}