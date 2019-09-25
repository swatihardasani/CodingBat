/**
 * Created by sunny on 11/8/18.
 */
public class StrDist {
    public static void main(String args[]){
        StrDist ob = new StrDist();
        System.out.println(ob.strDist("xyx", "z"));
    }
    public int strDist(String str, String sub) {

        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }

        if(!str.startsWith(sub) && str.endsWith(sub)){
            return  strDist(str.substring(1), sub);
        }



        return strDist(str.substring(1, str.length() - 1), sub);

    }
}
