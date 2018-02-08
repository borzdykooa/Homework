package HomeworkNine.HomeworNineTwo;

import java.util.Comparator;

public class StudentAverageMarkReverceComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAverageMark().compareTo(o1.getAverageMark());
    }
}