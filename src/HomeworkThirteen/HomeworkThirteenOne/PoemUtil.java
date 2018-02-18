package HomeworkThirteen.HomeworkThirteenOne;

public final class PoemUtil {

    private PoemUtil() {
    }

    public static String stringOfLetters(String string) {
        String one = string.replaceAll("=", "-");
        String two = one.replaceAll(" ", "\n");
        return two.replaceAll(",", "");
    }
}
