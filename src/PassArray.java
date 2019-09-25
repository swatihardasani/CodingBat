public class PassArray {
    public static void main(String args[]){

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Effects of passing reference to entire array");
        System.out.println("The values of the original array are: ");

        for(int value: arr){
            System.out.printf(" %d", value);
        }

        modifyArray(arr);
        System.out.printf("%n%nThe values of the modified array are: %n");

        for(int value : arr){
            System.out.printf(" %d", value);
        }

        System.out.printf("%n%nEffects of passing array element value: %n" + "array[3] before modifyElement: %d%n",
                arr[3]);

        modifyElement(arr[3]);
        System.out.printf("arr[3] after modifyElement: %d%n", arr[3]);
    }

    public static void modifyArray(int[] arr2){
        for(int i = 0; i < arr2.length; i++){
            arr2[i] *=  2;
        }
    }

    public static void modifyElement(int element){
        element *= 2;
        System.out.printf("Value of element in modifyElement: %d%n", element);
    }

}
