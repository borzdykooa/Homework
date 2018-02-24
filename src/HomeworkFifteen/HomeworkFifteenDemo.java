package HomeworkFifteen;

import java.util.ArrayList;
import java.util.List;

public class HomeworkFifteenDemo {

    public static void main(String[] args) {
        List<RobotParts> commonRobotPartsList = new ArrayList<RobotParts>();
        for (int i = 0; i < 20; i++) {
            commonRobotPartsList.add(RandomUtil.nextRobotParts());
        }
        System.out.println(commonRobotPartsList);

        List<RobotParts> firstScientistList = new ArrayList<RobotParts>();
        FirstScientist firstServant = new FirstScientist(firstScientistList, commonRobotPartsList);
        List<RobotParts> secondScientistList = new ArrayList<RobotParts>();
        SecondScientist secondServant = new SecondScientist(secondScientistList, commonRobotPartsList);
        Factory factory = new Factory(commonRobotPartsList);
        Day day = new Day(commonRobotPartsList);

        firstServant.start();
        secondServant.start();
        factory.start();
        day.start();
    }
}
