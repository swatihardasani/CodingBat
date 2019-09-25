/**
 * Created by sunny on 5/10/18.
 */
public class Stringmix {
    public static void main(String args[]){
        String a = "abc";
        String b = "xyz";
        String c = "";

        if(a.length() == b.length()){
            for(int i = 0; i < a.length(); i++){
                c = a.substring(i, i+ 1) + b.substring(i, i+ 1);
            }
        }

        System.out.println(c);
    }
}
