import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException{
        return numerator / denominator;

    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do{
            try{
                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();

                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.println(result);

            }

            catch(InputMismatchException ime){
                System.err.printf("%nException: %s%n", ime);
                scanner.nextLine();
                System.out.printf("You must enter integers.Please try again. %n%n");

            }
            catch(ArithmeticException ae){
                System.err.printf("%nException: %s%n", ae);
                System.out.printf("Zero is invalid denominator. Please try again.%n%n");

            }
        }while(continueLoop);


    }
}
