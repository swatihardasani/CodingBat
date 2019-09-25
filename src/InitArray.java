public class InitArray {

    public static void main(String args[]){

        final int Array_Length = 10;
        int[] arr = new int[Array_Length];

        //calculate value for each array element
        for(int counter = 0; counter < arr.length; counter++){
            arr[counter] = 2 + 2 * counter;


        }
        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter = 0; counter < arr.length; counter++){
            System.out.printf("%5d%8d%n", counter, arr[counter]);
        }

    }
}
