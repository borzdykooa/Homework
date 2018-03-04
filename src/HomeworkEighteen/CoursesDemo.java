package HomeworkEighteen;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import static java.lang.String.join;

public class CoursesDemo {

    public static void main(String[] args) {
        File coursesFile = new File(join(File.separator, "resources", "src", "courses.txt"));
        File firstReportFile = new File(join(File.separator, "resources", "src", "firstReport.txt"));
        File secondReportFile = new File(join(File.separator, "resources", "src", "secondReport.txt"));
        Pattern pattern = Pattern.compile("((\\d{2}):(\\d{2}))(\\s[А-Яа-я\\s]+)");
        List<String> list = new LinkedList<String>();

        CreateListUtil.createCoursesList(coursesFile, pattern, list);

        List<String> firstReportList = CreateListUtil.createFirstReportList(pattern, list);
        CreateFileUtil.createFirstReportFile(firstReportFile, pattern, list);

        Pattern newPattern = Pattern.compile("(\\d{2}):(\\d{2})-(\\d{2}):(\\d{2})(\\s[А-Яа-я\\s]+)");

        List<String> helpList = CreateListUtil.createHelpList(firstReportList, newPattern);

        List<String> secondReportList = new LinkedList<String>();

        CreateListUtil.createSecondReportList(helpList, secondReportList);
        CreateFileUtil.createSecondReportFile(secondReportList, secondReportFile);
    }
}
