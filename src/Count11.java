/**
 * Created by sunny on 11/1/18.
 */
public class Count11 {
  static int count;
    public int count11(String str){

        String str1 = "";
        int i = 0;
        int j = 2;
        if(i < str.length() && j < str.length()){
            str1 = str.substring(i, j);
            if(str1.equals("11")){
                count++;
                i += 2;
                j += 2;

            }
            else{
                i++;
                j++;
            }
            return count + count11(str.substring(i, str.length()));
        }
        return 0;

    }

    public static void main(String args[]){
        Count11 obj = new Count11();
        obj.count11("11abc11");
        System.out.println(count);

    }
}
