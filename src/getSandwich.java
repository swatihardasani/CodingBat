/**
 * Created by sunny on 5/16/18.
 */
public class getSandwich {
    public static void main(String args[]){
        String str = "breadjambread";

        String str2 = "";
        String str1 = "bread";
        boolean found = false;
        int indBr = 0;
        int indLBr = 0;
        boolean foundAgain = false;

        if(str.length() > 1) {
            indBr = str.indexOf(str1);
            System.out.println(indBr);
            found = true;
        }

        if(found) {
            indLBr = str.indexOf("bread", (indBr + 4));
            System.out.println(indLBr);
            foundAgain = true;
        }

        if(foundAgain){
            for(int i = indBr + 5; i < indLBr; i++){
                str2 += str.substring(i, i + 1);
            }
        }

        System.out.println(str2);


    }
}
