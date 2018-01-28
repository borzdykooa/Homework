import java.util.Arrays;

public class HomeworkFourOne {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[] secondArray = Arrays.copyOf(array, array.length);
        secondArray[0] = array[array.length - 1];

        for (int i = 1; i < secondArray.length; i++) {
            secondArray[i] = array[i - 1];
        }

        System.out.println(Arrays.toString(secondArray));
    }
}
