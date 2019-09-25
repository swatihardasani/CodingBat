/**
 * Created by sunny on 5/30/18.
 */
import java.util.*;
public class firstChar {
    public static void main(String args[]){
        String[] strings = {"salt", "tea", "soda", "toast"};

        Map<String, String> map = new HashMap<String, String>();

        for(int i = 0; i < strings.length; i++){
            if(!map.containsKey(strings[i].substring(0, 1))){
                map.put(strings[i].substring(0, 1), strings[i]);
            }
            else if(map.containsKey(strings[i].substring(0, 1))){
                if(strings[i].equals(strings[i])) {
                    String value = map.get(strings[i].substring(0, 1)) + strings[i];
                    map.put(strings[i].substring(0, 1), value);
                }
            }
        }

        System.out.println(map);
    }

}
