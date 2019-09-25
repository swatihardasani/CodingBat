/**
 * Created by sunny on 4/9/18.
 */
public class mod3 {
    public static void main(String args[]){
        int nums[] = {9, 7, 2, 9};
        boolean flag1 = false;
        boolean flag2 = false;
        if(nums.length >= 3){
            for(int i = 0; i < nums.length - 2; i++){
                if(nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 ==0){
                    flag1 = true;
                }
            }
            for(int i = 0; i < nums.length - 2; i++){
                if(nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] != 0){
                    flag2 = true;
                }
            }
        }

        if(flag1 == true || flag2 == true){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
