/**
 * Created by sunny on 4/9/18.
 */
public class HaveTwo {
    public static void main(String args[]){
        int nums[] = {2, 2, 4, 2};
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                count++;
            }
        }

        boolean flag = false;
        if(count == 0){
            flag = true;
        }

        if(count > 1){
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] == 2 && nums[i + 1] == 2){
                    break;
                }

            }
            flag = true;

        }
        System.out.println(flag);
    }
}
