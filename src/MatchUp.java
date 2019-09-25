/**
 * Created by sunny on 4/9/18.
 */
public class MatchUp {
    public static void main(String args[]){
        int nums1[] = {1, 2, 3};
        int nums2[] = {2, 3, 10};

        int count = 0;
        int result = 0;
        if(nums1.length == nums2.length) {
            for (int i = 0; i < nums1.length && i < nums2.length; i++) {
                result = nums1[i] - nums2[i];
                if (result <= 2) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }


}
