package HomeworkNine.HomeworNineTwo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Olga", "Borzdyko", 28, 7.0));
        list.add(new Student("Olga", "NeBorzdyko", 28, 7.0));
        list.add(new Student("Victrorija", "Vasil'eva", 22, 8.5));
        list.add(new Student("Nikolaj", "Ermola", 29, 8.5));
        list.add(new Student("Nikolaj", "Pankov", 25, 7.5));

        System.out.println("Список студентов: " + list.toString());
        System.out.println();

        list.sort(new StudentNameComparator());
        System.out.println("Список студентов, отсортированных по полному имени: " + list.toString());
        System.out.println();

        list.sort(new StudentAgeComparator());
        System.out.println("Список студентов, отсортированных по возрасту: " + list.toString());
        System.out.println();

        list.sort(new StudentAverageMarkComparator());
        System.out.println("Список студентов, отсортированных по среднему баллу: " + list.toString());
        System.out.println();

        studentMaxAverageMark(list);
        System.out.println("Студенты с самым высоким средним баллом: " + list.toString());
    }

    private static void studentMaxAverageMark(List<Student> list) {
        list.sort(new StudentAverageMarkReverceComparator());
        int i = 0;
        double maxAverageMark = 0;
        for (Iterator<Student> iterator = list.iterator(); iterator.hasNext(); ) {
            Student student = iterator.next();
            if (student.getAverageMark() >= maxAverageMark) {
                maxAverageMark = student.getAverageMark();
                i++;
            } else {
                iterator.remove();
            }
        }
    }
}