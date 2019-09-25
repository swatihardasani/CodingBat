/**
 * Created by sunny on 4/10/18.
 */
public class SameEnds {
    public static void main(String args[]){
        int nums[] = {5, 6, 45, 99, 13, 6, 5};
        int len = 1;

        for(int i = len; i < nums.length; i--){
            if(nums[i - 1] == nums[nums.length - len]){
                System.out.println(true);
            }

        }
        System.out.println(false);

    }
}
