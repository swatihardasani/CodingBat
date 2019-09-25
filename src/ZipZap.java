/**
 * Created by sunny on 6/4/18.
 */
public class ZipZap {
    public static void main(String args[]){
        String str = "zipXzap";

        int i = 0;
        if(str.length() >= 3){
            for(i = 0; i < str.length() - 2; i++){
                if(str.charAt(i) == 'z' && str.charAt(i + 2) == 'p'){
                    String before = str.substring(0, i + 1);
                    String after = str.substring(i + 2);
                    str = before + after;

                }

            }
        }
        System.out.println(str);
    }
}
