//ユーザの現在の年齢を入力し、10年後の年齢を表示するプログラム
import java.io.*;
import java.util.Scanner;

//自分で例外処理を作成する
//while文でqかeが出てくるまで入力を繰り返す


//- 2030年のユーザの年齢と
// - ユーザが誕生した年の元号n年(明治、大正、昭和、平成、令和)が表示されるプログラムを作成せよ。
// - 入力がqあるいはeの場合は終了するようにせよ。**それ以外はずっと繰り返し入力**を行う。
// - 入力した現在の年齢がマイナスおよび120歳以上の場合は再入力を促すようにせよ。
// - なお元年(1年)を優先すること。大まかな対応でよい。元号切り替えおよび誕生日は1/1を想定してください。
public class PrintYourAge {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int now = 2025;

		while(true){
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX } と書く
		try {
			System.out.println("何歳ですか?");
			String line = scanner.nextLine().trim();
			if(line.equals("q")||line.equals("e")){
				System.out.println("プログラムを終了します。");
                break;
			}
			int age = Integer.parseInt(line);

			//qかeが入力されたら終わり
			
			if(age < 0 || age >= 120){
				System.out.println("年齢は0-120で入力してください。");
					continue;
			}



			System.out.println("あなたは" + age + "歳ですね。");
			System.out.println("あなたは10年後に、" + (age + 10) + "歳ですね。");
			
			

            //元号
			int birth = now - age;
			String gengou = "";
			int year = 0;

			//2019をそのまま引くと0年からになっちゃうから1年少なく引いてる
			if(birth >= 2019){
				gengou = "令和";
				year = birth - 2018;
			}else if(birth >= 1989){
				gengou = "平成";
				year = birth - 1988;
			}else if(birth >= 1926){
				gengou = "昭和";
				year = birth - 1927;
			}else if(birth >= 1912){
				gengou = "大正";
				year = birth - 1911;
			}else{
				gengou = "明治";
				year = birth - 1867;
			}

			System.out.println("あなたは" + gengou + year + "年生まれですね。");

			



        }catch(NumberFormatException e) {
			System.out.println(e);
		}


		}
		scanner.close();
	}
}
