import java.util.Arrays;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray.length < 2) {
            return 0;
        }

        Arrays.sort(intArray);
        return intArray[intArray.length - 1] - intArray[0];
    }
}