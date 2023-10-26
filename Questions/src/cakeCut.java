import java.util.Scanner;

public class cakeCut {
    public static int minCuts(int friends){
        int minCuts;
        int totalPieces = friends+1;
        if(totalPieces % 2 == 0){
            minCuts = totalPieces/2;
        }
        else{
            minCuts = totalPieces;
        }
        return minCuts;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Invited Friends: ");
        int friends = scanner.nextInt();
        System.out.println(minCuts(friends));
    }
}
