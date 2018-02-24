package HomeworkFifteen;

import java.util.List;

public class FirstScientist extends Thread {

    private List<RobotParts> firstScientistList;
    private final List<RobotParts> commonRobotPartsList;
    private static int numberOfFirstScientistRobots;
    private int currentQualityOfNights;
    private RobotParts newRobotPart;

    public FirstScientist(List<RobotParts> firstScientistList, List<RobotParts> commonRobotPartsList) {
        this.firstScientistList = firstScientistList;
        this.commonRobotPartsList = commonRobotPartsList;
    }

    @Override
    public void run() {
        if (currentQualityOfNights < ConstantUtil.getTotalQualityOfNights()) {
            while (currentQualityOfNights < ConstantUtil.getTotalQualityOfNights()) {
                synchronized (commonRobotPartsList) {
                    int qualityOfTries = (int) (Math.random() * 4 + 1);
                    if (commonRobotPartsList.size() > qualityOfTries) {
                        for (int i = 0; i < qualityOfTries; i++) {
                            newRobotPart = commonRobotPartsList.remove
                                    (RandomUtil.getRANDOM().nextInt(commonRobotPartsList.size()));
                            firstScientistList.add(newRobotPart);
                            System.out.println("Прислужник первого ученого забрал себе деталь " + newRobotPart);
                        }
                        try {
                            System.out.println("Прислужник первого ученого уходит");
                            commonRobotPartsList.wait(ConstantUtil.getWaitTime());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            System.out.println("Прислужник первого ученого уходит, т.к. нет деталей");
                            commonRobotPartsList.wait(ConstantUtil.getWaitTime());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    currentQualityOfNights++;
                }
            }
        } else {
            Thread.interrupted();
        }
        System.out.println("Список деталей первого ученого " + firstScientistList.toString());
        while (firstScientistList.containsAll(RandomUtil.getVALUES())) {
            for (int i = 0; i < RandomUtil.getVALUES().size(); i++) {
                firstScientistList.remove(RandomUtil.getVALUES().get(i));
            }
            numberOfFirstScientistRobots++;
        }
        System.out.println("Первый ученый собрал " + numberOfFirstScientistRobots + " роботов");
    }
}
