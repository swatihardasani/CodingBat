public class Increment {
    public static void main(String args[]) {

        int c = 5;
        System.out.printf("c before post increment: %d%n", c);
        System.out.printf("c post incrementing: %d%n", c++);
        System.out.printf("c after post incrementing: %d%n", c);

        System.out.println();

        int d = 5;
        System.out.printf("d before pre increment: %d%n", d);
        System.out.printf("d pre incrementing: %d%n", ++d);
        System.out.printf("d after pre increment: %d%n", d);
    }
}


