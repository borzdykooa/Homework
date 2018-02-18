package HomeworkThirteen.HomeworkThirteenTwo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.String.join;

public class IntegerRandom {

    public static void main(String[] args) {
        File file = new File(join(File.separator, "resources", "src", "integers.txt"));

        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }

        try (FileOutputStream fos = new FileOutputStream(file);
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println(list);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String line = null;
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(file)))) {
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> newList = null;
        try {
            String finishLine = line.substring(1, line.length() - 1);
            newList = Arrays.asList(finishLine.split(", "));
            newList.sort(new ListComparator());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream(file);
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println(newList);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
