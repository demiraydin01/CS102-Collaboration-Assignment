import java.util.Random;

public class collabWork {
    
    // returns a random array with the values [0,100] for a given length
    public int[] createArray(int size){
        int[] result = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            result[i] = rand.nextInt(0,101);
        }
        return result;
    }
    public static int[] computeaverage(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        int average = sum / arr.length;
        int[] diffarr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            diffarr[i] = arr[i] - average;
        }
        return diffarr;
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
    
    public static void main(String[] args) {

        
    }
}
