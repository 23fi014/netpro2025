package pretest;

import java.util.Random;

public class CenterKamoku {
    private int score;
    private String name;


    //この上の2つの関数を実際に使うためにここでもう一回this.の形で使ってる
    public CenterKamoku(String name){
        this.name = name;
        Random rand = new Random();
        this.score = rand.nextInt(101);
    }

    public void printNameAndScore(){
        System.out.println(name + ":" + score);
    }
    public int getScore(){
        return score;
    }

    public String getName(){
        return name;
    }
    
}
