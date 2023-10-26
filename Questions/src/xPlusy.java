import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class xPlusy {

        public static int[] findXPlusY(int[] arr) {
            int n = arr.length;
            int[] result = new int[n];
            Stack<Integer> leftStack = new Stack<>();
            Stack<Integer> rightStack = new Stack<>();

            // Initialize the result array with -1
            Arrays.fill(result, -1);

            // Process elements from left to right to find x
            for (int i = 0; i < n; i++) {
                while (!leftStack.isEmpty() && arr[leftStack.peek()] <= arr[i]) {
                    leftStack.pop();
                }
                if (!leftStack.isEmpty()) {
                    result[i] = leftStack.peek();
                }
                leftStack.push(i);
            }

            // Process elements from right to left to find y
            for (int i = n - 1; i >= 0; i--) {
                while (!rightStack.isEmpty() && arr[rightStack.peek()] <= arr[i]) {
                    rightStack.pop();
                }
                if (!rightStack.isEmpty()) {
                    if (result[i] == -1 || result[i] > rightStack.peek()) {
                        result[i] = rightStack.peek();
                    }
                }
                rightStack.push(i);
            }

            // Calculate x + y for each element
            for (int i = 0; i < n; i++) {
                if (result[i] != -1) {
                    result[i] = arr[result[i]] + arr[i];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = findXPlusY(arr);
            for (int i = 0; i < n; i++) {
                System.out.println(result[i]);
            }
        }
    }


