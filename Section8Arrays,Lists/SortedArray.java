    // Create a program using arrays that sorts a list of integers in descending order.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    import java.lang.reflect.Array;
    import java.util.Arrays;
    import java.util.Scanner;

    public class SortedArray {
        public static void main(String[] args) {
        int[] arr = getIntegers(5);
        int[] sorted= sortIntegers(arr);
        printArray(sorted);

        }

    private static int[] getIntegers(int n){ //method to populate the array
        Scanner in = new Scanner(System.in);
        System.out.println("Enter "+ n+ " numbers: ");
        int[] a= new int[n];
        for (int i=0; i<a.length; i++){
            a[i]=in.nextInt();
        }
        return a;
    }

    private static void printArray (int [] a){ // method to print the array
        for(int i=0; i<a.length; i++){
            System.out.println("Element " + i+ " contains "+ a[i]);
        }
    }

    private static int[] sortIntegers(int[] a){ //create a copy of the array and sort the content
        int[] sortedArray= Arrays.copyOf(a, a.length);
//        int[] sortedArray= new int[a.length];
//        for (int i=0; i<a.length; i++){
//            sortedArray[i]=a[i];

        boolean flag=true;
        int temp;
        while (flag){ // loop to sort the new array
            flag=false;
            for (int i=0; i<sortedArray.length-1;i++){
                if (sortedArray[i] < sortedArray[i+1]) {
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

}
