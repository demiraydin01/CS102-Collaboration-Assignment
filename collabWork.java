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


    public static void main(String[] args) {

        
    }
}
