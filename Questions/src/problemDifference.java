import java.util.HashSet;
import java.util.Scanner;

public class problemDifference {

    public static int max_sets(int[]arr, int n){
        int count ;
        HashSet<Integer> problemSet =  new HashSet<>();
        for(int element : arr){
            problemSet.add(element);
        }

        if(problemSet.size() == 1) count =0;
        else if(problemSet.size() <=3)  count = 1;
        else count = 2;
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("No. of test cases: ");
        int testCases = scanner.nextInt();
        while(testCases > 0){
            int n = 4;
            int [] arr = new int[n];
            for(int i = 0; i < n; i++){
                System.out.print("Problem Difficulty: ");
                arr[i] = scanner.nextInt();
            }
            System.out.println(max_sets(arr,n));
            testCases--;
        }
    }
}
