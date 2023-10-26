import java.util.Scanner;

public class cakeCut {
    public static int minCuts(int friends){
        int minCuts;
        if((friends+1)% 2 == 0){
            minCuts = (friends+1)/2;
        }
        else{
            minCuts = (friends +1) *2;
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
