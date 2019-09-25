/**
 * Created by sunny on 4/30/18.
 */
public class countClumps {
    public static void main(String args[]){
        int nums[] = {1, 2, 2, 3, 4, 4};


        int countClumps = 0;
        int i = 0 , j = 0;
        for(i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                countClumps++;
                break;
            }
            j = i + 1;
            while(nums[i] != nums[j] &&  j < nums.length - 1){
                j++;
                countClumps = countClumps + 0;
            }
        }
    }
}
