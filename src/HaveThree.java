/**
 * Created by sunny on 4/9/18.
 */
public class HaveThree {
    public static void main(String args[]){
        int nums[] = {3, 1, 3, 3};
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                count++;
            }
        }
        boolean flag = false;
        if(count == 3){
            if(nums.length >= 3){
                for(int i = 0; i < nums.length - 2; i++){
                    if(nums[i] == 3 &&  nums[i + 2] == 3){
                        if (nums[i + 1] != 3) {
                            flag = true;
                        }
                    }
                }
            }
        }
        System.out.println(flag);
    }
}
