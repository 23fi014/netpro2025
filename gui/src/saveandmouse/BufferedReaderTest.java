package saveandmouse;

import java.io.*;
import java.net.*;

public class BufferedReaderTest {
	
	public static void main (String[] args) {
		BufferedReader br = null;
		try {
			File file = new File(new URI(BufferedWriterTest.class.getResource("")+BufferedWriterTest.FILE_NAME));
			//読み出す情報
			int area = 0;
			int stage = 0;
			String name = null;
			int level = 0;
			int hp = 0;
			int mp = 0;
			Place place = null;
			Hero hero = null;
			if(file.exists()) {
				br = new BufferedReader(new FileReader(file));
				String line = null;
				while((line = br.readLine()) != null) {
					String[] data = line.split(":");
					if(data.length == 2) {
						switch(data[0]) {
						case Place.AREA:
							area = Integer.parseInt(data[1]);
							break;
						case Place.STAGE:
							stage = Integer.parseInt(data[1]);
							break;
						case Hero.NAME:
							name = data[1];
							break;
						case Hero.LEVEL:
							level = Integer.parseInt(data[1]);
							break;
						case Hero.HP:
							hp = Integer.parseInt(data[1]);
							break;
						case Hero.MP:
							mp = Integer.parseInt(data[1]);
							break;
						}
//						System.out.println(data[0]);
//						System.out.println(data[1]);
					}
				}
				place = new Place(area,stage);
				hero = new Hero(name,level,hp,mp);
			}else {
				System.out.println("セーブデータがありません");
				place = new Place();
				hero = new Hero();
			}
			System.out.println("エリア"+place.getArea()+"---"+"ステージ"+place.getStage());
			System.out.println("勇者の名前は"+hero.getName());
			System.out.println(hero.getName()+"の強さは・・・");
			System.out.println("レベル"+hero.getLevel());
			System.out.println("体力"+hero.getHP());
			System.out.println("魔法力"+hero.getMP());
			System.out.println("です");
		}catch(IOException | URISyntaxException e) {
			e.printStackTrace();
		}catch(NumberFormatException e){
			System.err.println("セーブデータに数値以外が入っています（parseIntを使っている場所）");
		}finally {//プログラムが正常に実行されてもエラーによりcatch文が実行されても必ずfinallyブロックは実行されます
			try {
				if(br != null) {br.close();}
			}catch(IOException e){	
			}
		}
	}
}