import java.util.Random;
import java.util.Scanner;

public class collabWork {
    
    // returns a random array with the values [0,100] for a given length
    public static int[] createArray(int size){
        int[] result = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            result[i] = rand.nextInt(0,101);
        }
        return result;
    }
    public static int[] computeaveragediff(int[] arr){

        int average = computeAverage(arr);
        int[] diffarr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            diffarr[i] = arr[i] - average;
        }
        return diffarr;
    }
    public static int computeAverage(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        int average = sum / arr.length;
        return average;
    }

    public static int getMinimum (int[] arr){
        int min = arr[0];
        for(int element: arr){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
    
    public static int getMaximum(int[] arr){
        int max = arr[0];
        for(int element: arr){
            if(element>max){
                max = element;
            }
        }
        return max;
    }
     
    //Searches and finds the elements which are in even-numbered spaces
     public static int sumOfEvens(int[] arr){
        int sumOfEvens = 0;
        for(int i: arr){
            if(i%2==0){
                sumOfEvens+=arr[i];
            }
        }
        return sumOfEvens;
    }
    
    //Searches and finds the elements which are in odd-numbered spaces
    public static int sumOfOdds(int[] arr){
        int sumOfOdds = 0;
        for(int i: arr){
            if(i%2!=0){
                sumOfOdds+=arr[i];
            }
        }
        return sumOfOdds;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int arraySize;
        int chosenOperation = 0; //temp value
        boolean isOver = false;

        do { //Until user gives a non-negative integer
            System.out.print("Give an array size (non-negative integer): ");
            //Until user gives a proper integer
            while (!in.hasNextInt()) {
                System.out.print("Please enter a valid integer: ");
                in.nextLine();
            }
            arraySize = in.nextInt();
            in.nextLine();
        } while (arraySize < 0);

        //Create the array where the operations will be done
        int [] array = createArray(arraySize); 

        //Prompt the user again and again until the user quits
        do {
            //Inform the user
            System.out.println("\n---------Operations---------");
            System.out.println("1. Find the array's minimum value");
            System.out.println("2. Find the array's maximum value");
            System.out.println("3. Find the average of the array");
            System.out.println("4. See how far each element of the array is to the average");
            System.out.println("5. Find the sum of elements in odd-numbered spaces");
            System.out.println("6. Find the sum of elements in even-numbered spaces");
            System.out.println("7. Quit\n");

            do { //Until the user gives an integer in range 1-7
                System.out.print("Pick an operation (1-7): ");
                while (!in.hasNextInt()) { //Until the user gives an integer
                    System.out.print("Please enter a valid operation number (1-7): ");
                    in.nextLine();
                }
                chosenOperation = in.nextInt();
                in.nextLine();
            } while (chosenOperation < 1 || chosenOperation > 7);

            if (chosenOperation == 1) {

            }
            else if (chosenOperation == 2) {

            }
            else if (chosenOperation == 3) {

            }
            else if (chosenOperation == 4) {

            }
            else if (chosenOperation == 5) {
                System.out.println("Sum of the elements in odd-numbered spaces is"+ sumOfOdds(array));
            }
            else if (chosenOperation == 6) {
                System.out.println("Sum of the elements in even-numbered spaces is"+ sumOfEvens(array));    
            }
            else if (chosenOperation == 7) {
                System.out.println("Quitting...");
                isOver = true;
                in.close();
            }
        } while (!isOver);
    }
}
