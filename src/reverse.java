

/**
 * Created by sunny on 1/7/19.
 */
public class reverse {
    public static void main(String[] args) {
        int x = 123;
        int digit = 0;
        int reverse = 0;
        int newNo = 0;

        while (x > 0) {
            digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        System.out.println(reverse);
    }


}
