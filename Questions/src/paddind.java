import java.util.Scanner;

public class paddind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Size of the image (N x N)
        int p = scanner.nextInt(); // Number of padding layers

        long zeros = calculatePaddingZeros(N, p);
        System.out.println(zeros);
    }

    public static long calculatePaddingZeros(int n, int p){
        int padding = (n+(2*p));
        int zeroes = (padding*padding) - (n*n);
        return zeroes;

    }


}
