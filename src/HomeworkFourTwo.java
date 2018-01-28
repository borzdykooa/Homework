import java.util.Arrays;

public class HomeworkFourTwo {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 1, 5, 3, 2, 1, 1};
        Arrays.sort(array);
        int[] secondArray = Arrays.copyOf(array, array.length);
        for (int i = 1; i < secondArray.length; i++) {
            if (secondArray[i] == array[i - 1]) {
                secondArray[i] = 0;
            }
            Arrays.sort(secondArray);
        }

        System.out.println(Arrays.toString(secondArray));
    }
}
