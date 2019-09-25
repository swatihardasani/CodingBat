/**
 * Created by sunny on 4/12/18.
 */
public class evenOdd {
    public static void main(String args[]){
        int nums[] = {3, 3, 2};
        int nums2[] = new int[nums.length];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums2[index++] = nums[i];
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                nums2[index++] = nums[i];
            }
        }

        System.out.println(nums2);
    }
}
