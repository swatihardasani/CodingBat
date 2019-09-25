/**
 * Created by sunny on 5/11/18.
 */
public class xyzMiddle {
    public static void main(String args[]){
        String str = "AAAxyzB";

        int mid = str.length() / 2;
        if(str.length() % 2 == 0 ){
            mid -= 1;
        }

        boolean flag = false;

        int leftCount = 0;
        int rightCount = 0;

        for(int i = 0; i < mid; i++){
            leftCount++;
        }

        for(int i = mid + 1; i < str.length(); i++){
            rightCount++;

        }

        if (rightCount - leftCount== 0 || rightCount - leftCount == 1){
            for(int i = 0; i < str.length() - 2; i++){
                if(str.charAt(mid) == 'x' && str.charAt(mid + 1) == 'y' && str.charAt
                        (mid + 2) == 'z'){
                    flag = true;
                }
                else if(str.charAt(mid) == 'y' && str.charAt(mid - 1) == 'x' && str.charAt
                        (mid + 1) == 'z'){
                    flag = true;

                }



            }
        }
        System.out.println(flag);
    }
}
