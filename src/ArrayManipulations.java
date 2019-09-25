import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String args[]){
        double[] doubleArray = {8.4, 9.3, 6.2, 7.9, 3.4};
        Arrays.sort(doubleArray);
        System.out.print("doubleArray: " +doubleArray);

        for (double value: doubleArray){
            System.out.println(value);
        }
        System.out.println();

        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");

        int[] intArray = {1, 2, 3, 4, 5};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0 , intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.println(b);

        b = Arrays.equals(intArray, filledIntArray);
        System.out.println(b);

        //Search intArray for value 5
        int location = Arrays.binarySearch(intArray, 5);

        if(location >= 0){
            System.out.println("Found 5 at:  " + location);

        }
        else{
            System.out.println("Not Found");

        }


    }

    public static void displayArray(int[] arr, String description){
        System.out.println(description);

        for(int val: arr){
            System.out.print(val);
        }

        System.out.println();
    }
}
