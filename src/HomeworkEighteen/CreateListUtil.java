package HomeworkEighteen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CreateListUtil {

    public static final int NUMBER_OF_DAYS = 4;
    public static final int TOTAL_PERCENT = 100;

    private CreateListUtil() {
    }

    public static void createCoursesList(File file, Pattern pattern, List<String> list) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    list.add(matcher.group());
                } else {
                    list.add("\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> createFirstReportList(Pattern pattern, List<String> list) {
        StringBuffer stringBuffer = new StringBuffer();
        List<String> firstReportList = new LinkedList<String>();
        for (int i = 0; i < list.size() - 1; i++) {
            Matcher firstLineMatcher = pattern.matcher(list.get(i));
            Matcher nextLineMatcher = pattern.matcher(list.get(i + 1));
            if (firstLineMatcher.find() && nextLineMatcher.find()) {
                String firstReportLine = firstLineMatcher.group(1) + "-" + nextLineMatcher.group(1)
                        + firstLineMatcher.group(4) + "\n";
                firstLineMatcher.appendReplacement(stringBuffer, firstReportLine);
                firstReportList.add(firstReportLine);
            } else if (list.get(i).equals("\n")) {
                firstReportList.add("\n");
            }
            firstLineMatcher.appendTail(stringBuffer);
        }

        return firstReportList;
    }

    public static List<String> createHelpList(List<String> list, Pattern pattern) {
        List<String> helpList = new LinkedList<String>();
        for (int i = 0; i < list.size(); i++) {
            StringBuffer stringBuffer = new StringBuffer();
            Matcher matcher = pattern.matcher(list.get(i));
            if (matcher.find()) {
                String line = (Integer.parseInt(matcher.group(3)) * 60 + Integer.parseInt(matcher.group(4)))
                        - (Integer.parseInt(matcher.group(1)) * 60 + Integer.parseInt(matcher.group(2)))
                        + matcher.group(5);
                matcher.appendReplacement(stringBuffer, line);
                helpList.add(line);
            } else if (list.get(i).equals("\n")) {
                helpList.add("\n");
            }
            matcher.appendTail(stringBuffer);
        }
        helpList.add("\n");

        return helpList;
    }

    public static List<String> createSecondReportList(List<String> helpList, List<String> secondReportList) {
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            CreateListUtil.createOneDaySecondReportList(helpList, secondReportList);
        }

        return secondReportList;
    }

    public static List<String> createOneDaySecondReportList(List<String> helpList, List<String> secondReportList) {
        double totalTime = getTotalTime(helpList);
        addBreaks(helpList, secondReportList, totalTime);
        addExercises(helpList, secondReportList, totalTime);
        addSolutions(helpList, secondReportList, totalTime);
        addKindsOfLectures(helpList, secondReportList, totalTime);
        addLectures(helpList, secondReportList, totalTime);

        return secondReportList;
    }

    public static double getTotalTime(List<String> list) {
        double totalTime = 0;
        for (int i = 0; i <= list.indexOf("\n"); i++) {
            Pattern nextPattern = Pattern.compile("(\\d+)(\\s[А-Яа-я\\s]+)");
            Matcher lineMatcher = nextPattern.matcher(list.get(i));
            while (lineMatcher.find()) {
                totalTime += Integer.parseInt(lineMatcher.group(1));
            }
        }
        return totalTime;
    }

    public static int getTime(List<String> list, Pattern nextPattern) {
        int time = 0;
        for (int i = 0; i <= list.indexOf("\n"); i++) {
            Matcher lineMatcher = nextPattern.matcher(list.get(i));
            if (lineMatcher.find()) {
                time += Integer.parseInt(lineMatcher.group(1));
                list.remove(i);
                i--;
            }
        }

        return time;
    }

    public static void addBreaks(List<String> list, List<String> secondReportList, double totalTime) {
        Pattern pattern = Pattern.compile("(\\d+)(\\s((Перерыв)|(Обеденный перерыв)))");
        int breakTime = getTime(list, pattern);
        secondReportList.add("Перерыв: " + breakTime + " минут "
                + Math.round((breakTime * TOTAL_PERCENT / totalTime)) + "%");
    }

    public static void addSolutions(List<String> list, List<String> secondReportList, double totalTime) {
        Pattern pattern = Pattern.compile("(\\d+)(\\s(Решения))");
        int solutionTime = getTime(list, pattern);
        secondReportList.add("Решения: " + solutionTime + " минут "
                + Math.round((solutionTime * TOTAL_PERCENT / totalTime)) + "%");
    }

    public static void addExercises(List<String> list, List<String> secondReportList, double totalTime) {
        Pattern pattern = Pattern.compile("(\\d+)(\\s(Упражнения))");
        int exercisesTime = getTime(list, pattern);
        secondReportList.add("Упражнения: " + exercisesTime + " минут "
                + Math.round((exercisesTime * TOTAL_PERCENT / totalTime)) + "%");
    }

    public static void addLectures(List<String> list, List<String> secondReportList, double totalTime) {
        Pattern pattern = Pattern.compile("(\\d+)(\\s[А-Яа-я\\s]+)");
        int lecturesTime = getTime(list, pattern);
        secondReportList.add("Лекции: " + lecturesTime + " минут "
                + Math.round((lecturesTime * TOTAL_PERCENT / totalTime)) + "%" + "\n");
        list.remove(0);
    }

    public static void addKindsOfLectures(List<String> list, List<String> secondReportList, double totalTime) {
        secondReportList.add("Лекции: ");
        for (int i = 0; i <= list.indexOf("\n"); i++) {
            Pattern nextPattern = Pattern.compile("(\\d+)(\\s[А-Яа-я\\s]+)(\n)");
            Matcher lineMatcher = nextPattern.matcher(list.get(i));
            if (lineMatcher.find()) {
                int timeOfEachLecture = Integer.parseInt(lineMatcher.group(1));
                secondReportList.add(lineMatcher.group(2) + ": " + timeOfEachLecture + " минут "
                        + Math.round((timeOfEachLecture * TOTAL_PERCENT / totalTime)) + "%");
            }
        }
    }
}
