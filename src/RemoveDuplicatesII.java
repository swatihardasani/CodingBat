public class RemoveDuplicatesII {
    public static void main(String args[]){
        int[] nums = {1, 1, 1, 2, 2, 3};
        int count = 0;
        int i = 1;
        int j = 0;
        if(nums.length == 0){
            System.out.println(0);
        }
        while(j < nums.length && i < nums.length){
            nums[i] = nums[j];
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            i += 2;
        }

        System.out.println(i);

    }
}
