package HomeworkFifteen;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class RandomUtil {

    public RandomUtil() {
    }

    private static final Random RANDOM = new Random();
    private static final List<RobotParts> VALUES = Arrays.asList(RobotParts.values());
    private static final int SIZE = VALUES.size();

    public static Random getRANDOM() {
        return RANDOM;
    }

    public static List<RobotParts> getVALUES() {
        return VALUES;
    }

    public static RobotParts nextRobotParts() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
