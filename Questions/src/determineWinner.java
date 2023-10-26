public class determineWinner {
    public static String determine_winner(int[] A) {
        int n = A.length;

        int smallestNonZeroIndex = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0 && (smallestNonZeroIndex == -1 || A[i] < A[smallestNonZeroIndex])) {
                smallestNonZeroIndex = i;
            }
        }

        // If there is no non-zero element, Olivia loses as there are no valid moves.
        if (smallestNonZeroIndex == -1) {
            return "second";
        }

        // Count the number of non-zero elements in the array.
        int nonZeroCount = 0;
        for (int j : A) {
            if (j != 0) {
                nonZeroCount++;
            }
        }

        // If the number of non-zero elements is even, Olivia loses if she moves first.
        // If the number of non-zero elements is odd, Olivia wins if she moves first.
        if (nonZeroCount % 2 == 0) {
            return "second";
        } else {
            return "first";
        }
    }

    public static void main(String[] args) {
        int []arr = {2,1,3};
        System.out.println(determine_winner(arr));
    }
}