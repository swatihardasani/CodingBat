public class ATOI {
    public static void main(String args[]){
        int digit = 0;
        int result = 0;
        int index = 0;
        int sign = 1;

        String str = " ";

        //Empty String
        if(str.length() == 0){
            System.out.println(0);
        }

        //Remove whitespaces
        while(index < str.length() && str.charAt(index) == ' ' ){
            index++;
        }

        //Handle Signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+'? 1 : -1;
            index++;
        }

        //Convert number and ovoid overflow
        while(index < str.length()){
            digit = str.charAt(index) - '0';
            if(digit < 0 && digit > 9){
                break;
            }

            if(Integer.MAX_VALUE/10 < result || Integer.MAX_VALUE/10 == result && Integer.MAX_VALUE%10 < digit){
                System.out.println(sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            }
            result = 10 * result + digit;
            index++;
        }

        System.out.println(result * sign);
    }








}
