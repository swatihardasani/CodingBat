import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by sunny on 11/2/18.
 */
public class Array220 {

    public static void main(String args[]){

        int[] nums = {1,2,20};
        Array220 ob = new Array220();
        System.out.println(ob.array220(nums, 0));


    }

    public boolean array220(int[] nums, int index) {
        boolean result = false;
        int j = index + 1;
        if(nums.length == index){
            return false;
        }
        if(index <= nums.length){
            if(j < nums.length && nums[index] * 10 == nums[j]) {
                result = true;
            }
        }
        return result || array220(nums, index + 1);
    }

}


