/**
 * Created by sunny on 5/10/18.
 */
public class repeatSeperator {
    public static void main(String args[]) {
        String word = "Word";
        String sep = "X";
        int count = 3;
        String c = "";

        int sepIndex = count - 1;
        int i = 0, j = 0;

        for(i = 0, j = 0; i < count && j < sepIndex; i++, j++){

                c += word;

                c += sep;
        }

        c += word;
        System.out.println(c);

    }





}
