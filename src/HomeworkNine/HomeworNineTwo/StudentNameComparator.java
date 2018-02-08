package HomeworkNine.HomeworNineTwo;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    public int compare(Student o1, Student o2) {
        int result = o1.getFirstName().compareTo(o2.getFirstName());
        if (result == 0) {
            result = o1.getLastName().compareTo(o2.getLastName());
        }
        return result;
    }
}