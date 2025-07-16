package q2;

import java.util.Random;

public class ExamMaxAveMain {
    	public static void main(String[] args) {
		// シード値を設定する
        int score;
        String[] name = {"Math", "English", "Physics"};
		Random random = new Random(0);
        score = random.nextInt(101);
	
		// TODO 条件を満たす実装を行うこと
        ExamScores exam = new ExamScores();
        
        for(int i = 0; i < subjects.length; i++){
            subjects[i] = new CenterKamoku(names[i]);
        }
        
    }

        System.out.println("examid:" + exam.getMathScore() + );
	}
}