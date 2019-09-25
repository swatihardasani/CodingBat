/**
 * Created by sunny on 11/6/18.
 */
public class NestParen {
    public static void main(String args[]){
        String str = "(((x))";

        NestParen ob = new NestParen();
        System.out.println(ob.nestParen(str));
    }
    public boolean nestParen(String str) {

        int i = 0;
        int j = str.length() - 1;
        if(i < str.length() && j >= 0){
            if(str.charAt(i) != '(' && str.charAt(j) != ')') {
                return false;
            }
            else{
                i++;
                j--;
                nestParen(str.substring(i, j + 1));

            }
        }
        return true;

    }
}
