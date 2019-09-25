/**
 * Created by sunny on 4/19/18.
 */
public class canBalance {
    public static void main(String args[]){
        int nums[] = {1, 1, 1, 2, 1};

        for(int mid = 0; mid < nums.length ; mid++){


            int sum1 = 0, sum2 = 0;




           for(int i = 0; i < mid; i++){
              sum1 += nums[i];

           }

           for(int j = mid; j < nums.length; j++){
               sum2 += nums[j];
           }

           if(sum1 == sum2){
              System.out.println(true);
           }
        }
        System.out.println(false);
    }
}
