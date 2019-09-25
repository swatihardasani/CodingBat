import java.sql.SQLOutput;
import java.util.Scanner;

public class AccountTest {

    public static void main(String args[]){
        Account account1 = new Account("Jane Green", 0.0);
        Account account2 = new Account("John Blue", -7.53);

        System.out.println("Name: " + account1.getName());
        System.out.println("Balance: " + account1.getBalance());
        System.out.println("Name: " + account2.getName());
        System.out.println("Balance: " + account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        account1.deposit(depositAmount);

        System.out.println("Name: " + account1.getName());
        System.out.println("Balance " + account1.getBalance());






    }
}
