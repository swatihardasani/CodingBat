/**
 * Created by sunny on 4/21/18.
 */
public class SquareUp {
    public static void main(String args[]){
        int nums[] = new int[3 * 3];
        int nindex = 0;

        for(int i = 0; i < 1; i++){
            for(int z = 0; z < 3-i-1; z++){
                nums[nindex++] = 0;
            }
            for(int j=i;j >= 0 ;j--){
                nums[nindex++] = j+1;
            }
        }

        System.out.println(nums);
    }
}
