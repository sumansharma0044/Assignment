import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        shuffleArray(originalArray);

        // Print the shuffled array
        System.out.println(Arrays.toString(originalArray));
    }
    public static void shuffleArray(int[] array) {
        int index, temp;
        Random random = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
