package q4;

import java.util.*;

public class Dice {
    public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
            String enter = scanner.nextLine();
            //if(enter == "\n"){}
        Random random = new Random();
        int i = 0; // 試行回数
        //String[] args = {"quit", "exit", "0"};
        // for (i; i < length; i++) {
        //     int randomIndex = random.nextInt(charset.length());
        //     char randomChar = charset.charAt(randomIndex);
        //     sb.append(randomChar);
        // }
        //String stop;
        // for(int a = 0; a < 2; a++){
        //     stop = args[i];
        // }
        while (enter.equals(args[2])){
            i++;
            int randomIndex = random.nextInt();
			System.out.println(randomIndex + "（累計" + i + "回目）");		// TODO Diceを振る処理
            if(enter == "0"){
                scanner.close();
            }
        }

        
    }
}