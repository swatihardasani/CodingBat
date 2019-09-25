public class HappyNumber {

    public boolean isHappy(int n) {
        int sum = 0;
        boolean isHappy = false;



        while(sum != 1){
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            if (sum == 1) {
                isHappy = true;
            }
            else {
                n = sum;
                sum = 0;
            }
        }


        return isHappy;

    }

    public static void main(String args[]){
        HappyNumber obj = new HappyNumber();

        System.out.println(obj.isHappy(19));
    }

}
