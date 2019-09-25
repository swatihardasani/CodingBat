import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strArr = pattern.split(" ");

        Map<String, Character> map = new HashMap<String, Character>();
        Map<Character, String> map1 = new HashMap<Character, String>();


        for(int i = 0; i < strArr.length && i < str.length(); i++){
            if(map.containsKey(strArr[i])){
                if(map.get(strArr[i]) != str.charAt(i)) {
                    return false;
                }
            }

            map.put(strArr[i], str.charAt(i));
        }

        for(int i = 0; i < str.length() && i < strArr.length; i++){
            if(map1.containsKey(str.charAt(i))){
                System.out.println(map1.get(str.charAt(i)));
                if(!map1.get(str.charAt(i)).equals(strArr[i])) {
                    return false;
                }
            }

            map1.put(str.charAt(i), strArr[i]);
        }

        return true;


    }


    public static void main(String args[]){
        WordPattern obj = new WordPattern();

        System.out.println(obj.wordPattern("dog dog dog dog", "abba"));
    }


}
