package pretest;



public class CenterKamokuManager {
    //[]はクラス名(？)の後に付けるのがJavaでは普通だけどどっちでも動く
    private CenterKamoku[] subjects = new CenterKamoku[5];
    public CenterKamokuManager(){
        String[] names = {"国","数","英","理","社"};
        for(int i = 0; i < subjects.length; i++){
            subjects[i] = new CenterKamoku(names[i]);
        }
        
    }

    public void printAllScore(){
        for(int i = 0; i < subjects.length; i++){          
            System.out.println(subjects[i].getScore());
            //ここに科目名入れてもいいかも
        }
        
    }

    public void printAverageScore(){
        int total = 0;
        for(int i = 0; i < subjects.length; i++){
            total += subjects[i].getScore();

        }
        int average = total / subjects.length;
        System.out.println(average);
    }

    public void printMaxScore(){
        int max = -1;
        //全部がゼロ点のとき最高点がでなくなっちゃうから-1で確実に出るようにしている
        String name = "";
        for(int i = 0; i < subjects.length; i++){
            if(max < subjects[i].getScore()){
                max = subjects[i].getScore();
                name = subjects[i].getName();
            }
        }
        System.out.println("最高科目" + name + ":" + max);
    }

    public static void main(String[] args){
        CenterKamokuManager manager = new CenterKamokuManager();
        manager.printAllScore();
        manager.printAverageScore();
        manager.printMaxScore();

    }
}
