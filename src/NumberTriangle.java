/**
 * Created by sunny on 2/27/19.
 */
public class NumberTriangle {
    public static void main(String args[]){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i + 1; j++){
               for(int k = j + 1; k < j + 2; k++){
                   System.out.print( k + " ");
               }

            }
            System.out.println();

        }


    }
}
