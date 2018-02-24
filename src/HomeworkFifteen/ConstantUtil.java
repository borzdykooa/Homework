package HomeworkFifteen;

public final class ConstantUtil {

    private static final int TOTAL_QUALITY_OF_NIGHTS = 100;
    private static final int WAIT_TIME = 50;
    private static final int SLEEP_TIME = 85;
    private static final int DAY_TIME = 15;

    public ConstantUtil() {
    }

    public static int getDayTime() {
        return DAY_TIME;
    }

    public static int getSleepTime() {
        return SLEEP_TIME;
    }

    public static int getWaitTime() {
        return WAIT_TIME;
    }

    public static int getTotalQualityOfNights() {
        return TOTAL_QUALITY_OF_NIGHTS;
    }
}
