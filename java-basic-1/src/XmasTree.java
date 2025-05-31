import java.util.Scanner;

public class XmasTree {
    public static void main(String[] arrgs){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("一番下の葉の数の半分の幅,幹の幅,幹の長さ,雪模様(任意の記号)を入力してください。");
            String line = Scanner.Line();
        }catch(NumberFormatException e) {
			System.out.println(e);
		}

    }
}
