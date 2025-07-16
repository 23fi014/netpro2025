package q4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.*;

public class JankenServerRandom {
	public static void main(String[] args) {
		// TODO 実装しなさい
         ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("サーバ起動中...");

        Socket clienSocket = serverSocket.accept();
        System.out.println("クライアント接続完了");

        //情報を受け取る
        BufferedReader in = new BufferedReader(
            new InputStreamReader(clienSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clienSocket.getOutputStream(),true);

        //読み込んだ文字列
        String inputline;
        //1行ずつ読み込んでる間は
        while((inputline = in.readLine()) != null){
            try{
                String hand = toString(inputline);
                boolean result = isWin(hand);
                if(result){
                    System.out.println(hand + "is Prime");
                }else {
                    System.out.println(hand + "is non-Prime");
                }

            } catch(StringIndexOutOfBoundsException e){
                System.out.println("エラー：　文字を入力してください");

            }

        }

        //全部閉じる
        in.close();
        out.close();
        clienSocket.close();
        serverSocket.close();
        System.out.println("サーバ終了");
	}

     public static boolean isWin(String hand){
        if(num <= 1){
            return false;
        }

        for(int i = 0; i < Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;

    }
}