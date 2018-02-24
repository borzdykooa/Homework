package HomeworkFifteen;

import java.util.List;

public class Day extends Thread {

    private final List<RobotParts> commonRobotPartsList;
    private int qualityOfNights;

    public Day(List<RobotParts> commonRobotPartsList) {
        this.commonRobotPartsList = commonRobotPartsList;
    }

    @Override
    public void run() {
        synchronized (commonRobotPartsList) {
            try {
                Day.sleep(ConstantUtil.getDayTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (qualityOfNights < ConstantUtil.getTotalQualityOfNights()) {
            while (qualityOfNights < ConstantUtil.getTotalQualityOfNights()) {
                synchronized (commonRobotPartsList) {
                    try {
                        Thread.sleep(ConstantUtil.getSleepTime());
                        System.out.println("Наступил день, все спят");
                        commonRobotPartsList.wait(ConstantUtil.getDayTime());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    qualityOfNights++;
                }
            }
        } else {
            Thread.interrupted();
        }
    }
}
