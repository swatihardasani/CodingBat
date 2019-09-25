/**
 * Created by sunny on 4/9/18.
 */
public class Has77 {
    public static void main(String args[]){
        int nums[] = {2, 7, 2, 2, 7, 2};
        boolean flag = false;
        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i + 1] == 7) {
                flag = true;
            }
        }
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == 7 && nums[i + 2] == 7){
                flag = true;
            }



        }
        System.out.println(flag);
    }
}
