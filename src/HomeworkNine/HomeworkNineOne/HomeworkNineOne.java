package HomeworkNine.HomeworkNineOne;

import java.util.List;

public class HomeworkNineOne {

    List<String> list;

    public HomeworkNineOne(List<String> list) {
        this.list = list;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "HomeworkNineOne{" +
                "list=" + list +
                '}';
    }
}
