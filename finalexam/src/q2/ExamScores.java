package q2;

public class ExamScores {
	// TODO クラス図に従い実装すること
    public void setExamId(int examld){
        int id = 0;
        for(int i = 0; i < 3000; i++){
            id = i;
        }
    }

    public int getExamId(){
        return ;
    }

    public void setMathScore(int mathScore){

        
    }

    public int getMathScore(){

    }

    public void setEngScore(int engScore){

    }

    public int getEngScore(){

    }

    public void setPhysicsScore(int physicsScore){

    }

    public int getPhysicsScore(){

    }

    public float getAverageScore(){
        int ave = (getMathScore() + getEngScore() + getPhysicsScore())/3;
        return ave;

    }

    public boolean isPass(){
        if(getMathScore() == 100){
            return true;
        }else if(getAverageScore() >= 80){
            return true;
        }
        return false;
    }
}
