/**
 * Created by sunny on 11/3/18.
 */
public class StrCopies {
    public static void main(String args[]){
        String str = "iiiiijjj";
        String sub = "i";
        int n = 3;
        StrCopies ob = new StrCopies();
        System.out.println(ob.strCopies(str,sub, n));


    }
    public boolean strCopies(String str, String sub, int n) {
        String str1 = "";
        int count = 0;
        int len = sub.length();
        int i = 0;
        boolean result = false;

        if (i < str.length() && len <= str.length()) {
            str1 = str.substring(i, len);
            if (str1.equals(sub)) {
                i += len;
                n--;

            }
            else {
                i++;
            }
        }
        else{
            return false;
        }

        if(n <= 0){
            result = true;
        }

        return result || strCopies(str.substring(i, str.length()),sub, n);
    }
}
