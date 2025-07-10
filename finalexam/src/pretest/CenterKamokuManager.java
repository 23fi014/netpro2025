package pretest;

import java.util.Random;


public class CenterKamokuManager {
    private CenterKamoku[] subjects = new CenterKamoku[5];

    public CenterKamokuManager() {
        String[] names = {"英", "国", "数", "社", "理"};
        for (int i = 0; i < names.length; i++) {
            subjects[i] = new CenterKamoku(names[i]);
        }
    }

    public void printAllScore() {
        for (int i = 0; i < subjects.length; i++) {
            subjects[i].printNameAndScore();
        }
    }

    public void printAverageScore() {
        int total = 0;
        for (int i = 0; i < subjects.length; i++) {
            total += subjects[i].getScore();
        }
        int average = total / subjects.length;
        System.out.println("5科目の平均は：" + average + "点");
    }

    public void printMaxScore() {
        int maxScore = -1;
        String maxName = "";
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].getScore() > maxScore) {
                maxScore = subjects[i].getScore();
                maxName = subjects[i].getName();
            }
        }
        System.out.println("最高点は" + maxScore + "点の" + maxName + "です。");
    }

    public static void main(String[] args) {
        CenterKamokuManager manager = new CenterKamokuManager();
        manager.printAllScore();
        manager.printAverageScore();
        manager.printMaxScore();
    }
}
