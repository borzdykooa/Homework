package HomeworkThirteen.HomeworkThirteenOne;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.String.join;

public class PoemDemo {

    public static void main(String[] args) throws IOException {
        File poem = new File(join(File.separator, "resources", "src", "poem.txt"));
        File numberOfLetters = new File(join(File.separator, "resources", "src", "numberOfLetters.txt"));

        try {
            numberOfLetters.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        Map<Character, Integer> map = new TreeMap<Character, Integer>();

        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(poem)))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String newLine = line.toLowerCase();

                for (int i = 0; i < newLine.length(); i++) {
                    if (Character.isLetter(newLine.charAt(i))) {
                        if (map.containsKey(newLine.charAt(i))) {
                            map.put(newLine.charAt(i), map.get(newLine.charAt(i)) + 1);
                        } else {
                            map.put(newLine.charAt(i), 1);
                        }
                    }
                }
            }
        }

        String string = map.entrySet().toString();

        try (FileOutputStream fos = new FileOutputStream(numberOfLetters);
             PrintStream printStream = new PrintStream(fos)) {
            printStream.println(PoemUtil.stringOfLetters(string));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
