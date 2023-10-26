import java.util.Scanner;

public class rohanGarden {
    public static int minWaitingTime(int trees, int extraApples, int[] apples, int [] fallRate){
        int minWaitingTime = 0;

        int [] times =new int[trees];

        while(extraApples > 0){
            for(int i = 0; i < trees ; i++){
                if(apples[i] > fallRate[i]){
                    apples[i] = apples[i] - fallRate[i];
                    times[i]++;
                }
                else{
                    int extra = fallRate[i] - apples[i];
                    if (extraApples >= extra) {
                        extraApples -=extra;
                        apples[i]+= extra;
                        apples[i] = apples[i] -fallRate[i];
                        times[i]++;
                    }
                    else if(extraApples < extra){
                        extraApples = 0;
                        apples[i] = 0;
                        times[i]++;
                    }
                }
            }
        }
        for( int time : times ){
            if(time > minWaitingTime){
                minWaitingTime = time;
            }
        }

        return minWaitingTime;
    }
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Total Number of trees: ");
        int trees = t.nextInt();
        System.out.print("Extra Apples: ");
        int extraApples = t.nextInt();
        int [] apples = new int[trees];
        int [] fallRate = new int[trees];
        for(int i  = 0; i < trees ; i++){
            System.out.print("Existing apple: ");
            apples[i] = t.nextInt();
            System.out.print("Fall Rate: ");
            fallRate[i] = t.nextInt();
        }
        System.out.println(minWaitingTime(trees, extraApples, apples,fallRate));
    }
}
