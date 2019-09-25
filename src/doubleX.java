/**
 * Created by sunny on 5/21/18.
 */
public class doubleX {
    public static void main(String args[]){
        String str = "xaxxx";

        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count  = 1;
                break;

            }

        }

        if(count == 1){
            System.out.println(true);
        }
        System.out.println(false);
    }

}
