// Create a program using arrays that sorts a list of integers input from keyboard in descending order.

import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integers = getIntegers(5); // actual values of the array passed through the method getIntegers
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Integer at index " + i + " typed was: " + integers[i]);
        }
        System.out.println("You have entered " + integers.length +" numbers .The average is: " + getAverage(integers));
        printArray(sortIntegers(integers));

    }

    public static int [] getIntegers (int sizeOfArray) {
        System.out.println("Enter " + sizeOfArray + " integer values.");
        int [] values= new int[sizeOfArray]; // create new array called values
        for (int i=0; i<values.length; i++ ){
            values[i]=in.nextInt(); //accepts int from the console and store it in array values
        }
        return values; //returns the array to put in in the integers[]

    }
    public static double getAverage (int [] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return (double) sum/ (double) array.length;
    }

    public static void printArray(int [] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element " +i + " contains " + array[i]);
        }
    }

    public static int [] sortIntegers (int [] array){
//        int[] sortedArray = new int [array.length]; // creating an array of the same size as the parameter
//        for (int i=0; i<array.length; i++){
//            sortedArray[i]=array[i]; //copy of the content of the array in the new array
//        }
        int [] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag =true;
        int temp;
        while (flag){
            flag=false; // if the array has not sorted all the number the loop does not end
            for (int i=0; i<sortedArray.length-1; i++){
                if (sortedArray[i]<sortedArray[i+1]){ // if the next element is higher, then swap them
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true; //loop ends

                }
            }
        }
        return sortedArray;
    }

}

