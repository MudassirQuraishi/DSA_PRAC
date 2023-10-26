import java.util.HashMap;
import java.util.Map;

public class vibgyor {
    public static int sharpnerBallon(int[] arr){
        int[] findArr = {1, 2, 3, 4, 5, 6, 7};

        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (contains(findArr, num) && !map.containsKey(num)) {
                map.put(num, 1);
            }
            count++;
            if (map.size() == 7) {
                break;
            }
        }


        return count;
    }
    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr= {11,2,4,6,8,10,3,5,7,9};
        System.out.println(sharpnerBallon(arr));
    }
}
