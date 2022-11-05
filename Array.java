import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // VECTORS OR ARRAYS

        /*
        String[] letters = new String[8];
        [0] [1] [2] [3] [4]
        letters[0] = "O";
        letters[1] = "U";
        letters[2] = "T";
        letters[3] = " ";
        letters[4] = "P";
        letters[5] = "U";
        letters[6] = "T";

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }
        */

        String[] letters = {"O", "U", "T", " ", "P", "U", "T"};
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
        }

        System.out.println(Arrays.toString(letters));

/*-------------------------------------------------------------------------------------*/

        int[] numbers = { 3, 23, 5, 90, 12, 15};
        int bigger = numbers[0];
        int shorter = numbers[0];
        int mean = 0;

        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] > bigger) {
                bigger = numbers[i];
            }
            if (numbers[i] < shorter) {
                shorter = numbers[i];
            }
            mean += numbers[i];
        }

        System.out.println("Bigger: " + bigger);
        System.out.println("Shorter: " + shorter);
        System.out.println("Mean: " + mean/numbers.length);

    }
}
