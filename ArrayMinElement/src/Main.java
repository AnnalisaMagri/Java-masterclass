import java.util.Scanner;

public class Main {

    private static Scanner in =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter count: ");
        System.out.println("Minimum value entered is: " + findMin(readIntegers(in.nextInt())));


    }

    public static int[]  readIntegers(int count) { // method returns an int array
        int []array = new int [count]; //creating an array and initialize all the elements to 0
        for (int i=0; i<array.length; i++){
            System.out.print("Enter an number: ");
            array[i]=in.nextInt();
        }
        return array;
    }

    private static int findMin (int [] array){
        int min=Integer.MAX_VALUE; // max value that an int can contain,
        // so we are sure that the min is an input from the user
        for (int i=0; i<array.length; i++){
            int value= array[i]; // comparing each value
            if (value<min){ // if value smaller than current min, then assign to min
                min=value;
                }
        }
        return min;
    }


    }

