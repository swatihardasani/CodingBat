public class MajorityElement {
    public static void main(String args[]){
        int[] nums = {3,2,3};
        int m = nums[0];
        int mCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(m == nums[i]){
                mCount++;
            }
            else{
                mCount--;
            }

            if(mCount == 0){
                m = nums[i];
            }
        }

        System.out.println(m);
    }
}
