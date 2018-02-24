package HomeworkFifteen;

import java.util.List;

public class SecondScientist extends Thread {

    private List<RobotParts> secondScientistList;
    private final List<RobotParts> commonRobotPartsList;
    private int numberOfSecondScientistRobots;
    private int currentQualityOfNights;
    private RobotParts newRobotPart;

    public SecondScientist(List<RobotParts> secondScientistList, List<RobotParts> commonRobotPartsList) {
        this.secondScientistList = secondScientistList;
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
                            secondScientistList.add(newRobotPart);
                            System.out.println("Прислужник второго ученого забрал себе деталь " + newRobotPart);
                        }
                        try {
                            System.out.println("Прислужник второго ученого уходит");
                            commonRobotPartsList.wait(ConstantUtil.getWaitTime());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        try {
                            System.out.println("Прислужник второго ученого уходит, т.к. нет деталей");
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
        System.out.println("Список деталей второго ученого " + secondScientistList.toString());
        while (secondScientistList.containsAll(RandomUtil.getVALUES())) {
            for (int i = 0; i < RandomUtil.getVALUES().size(); i++) {
                secondScientistList.remove(RandomUtil.getVALUES().get(i));
            }
            numberOfSecondScientistRobots++;
        }
        System.out.println("Второй ученый собрал " + numberOfSecondScientistRobots + " роботов");
    }
}
