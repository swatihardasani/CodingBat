/**
 * Created by sunny on 4/6/18.
 */
public class centeredAverage {

    public static void main(String args[]){


        int nums[] = {1, 1, 5, 5, 10, 8, 7};
        int min = nums[0];
        int mn = 0;
        for(int i = 0; i < nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
                mn = i;
            }
        }

        int max = nums[0];
        int mx = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                mx = i;
            }
        }

        int sum = 0, avg = 0;
        int count = 0;
        for(int i = 0;  i < nums.length; i++){
            if(nums[i] > min && nums[i] < max) {
                if (i != mn && i != mx) {
                    ++count;
                    sum += nums[i];
                }
            }
        }

        avg = sum / count;
        System.out.println(avg);

    }
}
