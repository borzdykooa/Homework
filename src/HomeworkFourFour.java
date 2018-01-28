import java.util.Arrays;

public class HomeworkFourFour {

    public static void main(String[] args) {
        int[][] doubleArray = {{1, 2, 3, 4, 5}, {7, 8, 9}};
        int[] result = linearize(doubleArray);
        System.out.println(Arrays.toString(result));
    }

    private static int[] linearize(int[][] doubleArray) {
        int[] firstSingleArray = doubleArray[0];
        int[] secondSingleArray = doubleArray[1];
        int[] result = new int[firstSingleArray.length + secondSingleArray.length];
        for (int i = 0; i < firstSingleArray.length; i++) {

            for (int j = firstSingleArray.length; j < secondSingleArray.length + firstSingleArray.length; j++) {
                result[i] = doubleArray[0][i];
                result[j] = doubleArray[1][j - firstSingleArray.length];
            }
        }
        return result;
    }
}
