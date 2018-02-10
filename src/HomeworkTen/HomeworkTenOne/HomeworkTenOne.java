package HomeworkTen.HomeworkTenOne;

public class HomeworkTenOne {

    private String text;

    public HomeworkTenOne(String text) {
        this.text = text;
    }

    public static String textWithoutPunctuationMarks(String text) {
        String textOne = text.replace(".", ",");
        String textTwo = textOne.replace(":", ",");
        String textThree = textTwo.replace(", ", " ");
        return textThree.replace(",", " ");
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "HomeworkTenOne{" +
                "text='" + text + '\'' +
                '}';
    }
}