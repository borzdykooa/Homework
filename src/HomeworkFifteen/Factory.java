package HomeworkFifteen;

import java.util.List;

public class Factory extends Thread {

    private final List<RobotParts> commonRobotPartsList;
    private int qualityOfNights;

    public Factory(List<RobotParts> commonRobotPartsList) {
        this.commonRobotPartsList = commonRobotPartsList;
    }

    @Override
    public void run() {
        if (qualityOfNights < ConstantUtil.getTotalQualityOfNights()) {
            while (qualityOfNights < ConstantUtil.getTotalQualityOfNights()) {
                synchronized (commonRobotPartsList) {
                    int qualityOfTries = (int) (Math.random() * 4 + 1);
                    for (int i = 0; i < qualityOfTries; i++) {
                        commonRobotPartsList.add(RandomUtil.nextRobotParts());
                        System.out.println("Фабрика выбросила на свалку деталь " + RandomUtil.nextRobotParts());
                    }
                    try {
                        System.out.println("Фабрика прекращает работу");
                        commonRobotPartsList.wait(ConstantUtil.getWaitTime());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                qualityOfNights++;
            }
        } else {
            Thread.interrupted();
        }
    }
}
