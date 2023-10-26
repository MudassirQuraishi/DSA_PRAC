
import java.util.HashMap;
public class sandyPlanks {
    public static int sandy_planks(String plank){
        int count = 0;
        StringBuilder result = new StringBuilder();
        for(int i  = 0; i < plank.length()-1; i++){
            if(plank.charAt(i) != plank.charAt(i+1)){
                result.append(plank.charAt(i));
            }
        }
        plank = result.toString();
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        for( char c : plank.toCharArray()){
            frequencyMap.put(c,frequencyMap.getOrDefault(c,0)+1);
            if(frequencyMap.get(c)>count){
                count = frequencyMap.get(c);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String plank= "WWBWB";
        System.out.println(sandy_planks(plank));
    }
}
