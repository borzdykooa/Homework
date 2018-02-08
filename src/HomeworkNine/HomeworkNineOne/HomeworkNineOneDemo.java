package HomeworkNine.HomeworkNineOne;

import java.util.LinkedList;
import java.util.List;

public class HomeworkNineOneDemo {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("every");
        list.add("Java");
        list.add("programmer");

        System.out.println(list.toString());
        System.out.println();

        markLength4(list);
        System.out.println(list.toString());
    }

    private static void markLength4(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
                i++;
            }
        }
    }
}
