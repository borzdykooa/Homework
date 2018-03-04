package HomeworkEighteen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CreateFileUtil {

    private CreateFileUtil() {
    }

    public static void createFirstReportFile(File file, Pattern pattern, List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < list.size() - 1; i++) {
                Matcher firstLineMatcher = pattern.matcher(list.get(i));
                Matcher nextLineMatcher = pattern.matcher(list.get(i + 1));
                if (firstLineMatcher.find() && nextLineMatcher.find()) {
                    String firstReportLine = firstLineMatcher.group(1) + "-" + nextLineMatcher.group(1)
                            + firstLineMatcher.group(4) + "\n";
                    firstLineMatcher.appendReplacement(stringBuffer, firstReportLine);
                    bufferedWriter.write(firstReportLine);
                } else if (list.get(i).equals("\n")) {
                    bufferedWriter.write("\n");
                }
                firstLineMatcher.appendTail(stringBuffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createSecondReportFile(List<String> list, File file) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i) + "\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
