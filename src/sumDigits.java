/**
 * Created by sunny on 6/6/18.
 */
public class sumDigits {
    public static int count7(int n) {
        int count = 0;

        if (n == 0) {
            return 0;
        } else {
            int digit = (n % 10);
            if (digit == 7) {
                count++;
            }
            count7(n / 10);


            return count;
        }
    }


        public static void main(String args[]) {
        System.out.println(count7(717));
    }
}
