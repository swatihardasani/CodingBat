/**
 * Created by sunny on 1/28/19.
 */
import java.util.Map;
import java.util.HashMap;
public class checkInclusion {
    public static void main(String args[]){
        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean hasPerm = true;
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();


        for(int i = 0; i < s1Arr.length; i++){
            if(!map.containsKey(s1Arr[i])){
                map.put(s1Arr[i], 1);
            }
        }

        for(int j = 0; j < s2Arr.length; j++){
            if(map.containsKey(s2Arr[j])){
                int val = map.get(s2Arr[j]) - 1;
                map.put(s2Arr[j], val) ;
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() != 0){
                hasPerm = false;
            }
        }
        System.out.println(hasPerm);
    }
}
