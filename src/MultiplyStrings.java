/**
 * Created by sunny on 10/12/18.
 */
public class MultiplyStrings {
    public  static int convertToInt(char c){
        return c - '0';
    }
    public static void main(String args[]){
        String num1 = "11";
        String num2 = "12";

        int first = 0;
        int second = 0;
        int result = 0;
        int ans = 0, r = 1;
        int i = num2.length() - 1;


        String finalResult = "";
        while(i >= 0){
            first = convertToInt(num2.charAt(i));
            for(int j = num1.length() - 1; j >= 0; j--){
                second = convertToInt(num1.charAt(j));
                result = first * second;
                System.out.print(result);
                finalResult = result +finalResult;


            }

            for(int k = 0; k < finalResult.length(); k++){
               int a = convertToInt(finalResult.charAt(i));
                ans = a * r;
                r *= 10;

            }

            i--;



        }

        System.out.print(finalResult);

    }



}
