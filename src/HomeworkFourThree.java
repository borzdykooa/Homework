import java.util.Arrays;

public class HomeworkFourThree {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 6, 7};
        int[] resultArray = new int[firstArray.length + secondArray.length];
        resultArray[0] = firstArray[0];
        resultArray[1] = secondArray[0];

        for (int i = 1; i < resultArray.length / 2 - 1; i++) {
            resultArray[2 * i] = firstArray[i / 2 + 1];
            resultArray[2 * i + 1] = secondArray[i / 2 + 1];
        }
        if (firstArray.length > secondArray.length) {
            int lastArrayMembers = firstArray.length - secondArray.length;
            for (int j = resultArray.length - lastArrayMembers; j < resultArray.length - 1; j++) {
                resultArray[j] = firstArray[j - secondArray.length];
                resultArray[j + 1] = firstArray[j + 1 - secondArray.length];
            }
        } else if (firstArray.length < secondArray.length) {
            int lastArrayMembers = secondArray.length - firstArray.length;
            for (int k = resultArray.length - lastArrayMembers; k < resultArray.length - 1; k++) {
                resultArray[k] = secondArray[k - firstArray.length];
                resultArray[k + 1] = secondArray[k + 1 - firstArray.length];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
