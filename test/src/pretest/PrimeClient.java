package pretest;

import java.io.*;
import java.net.*;

public class PrimeClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        System.out.println("サーバに接続しました");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader stdIn = new BufferedReader(
                new InputStreamReader(System.in));

        String userInput;
        while (true) {
            System.out.print("数字を入力（qで終了）：");
            userInput = stdIn.readLine();

            //Systemを付けるのはコンソールに表示したいとき
            //サーバに送るために定義したoutを使ってサーバ側にprintlnしている
            out.println(userInput);

            if (userInput.equalsIgnoreCase("q") || userInput.equalsIgnoreCase("exit")) {
                break;
            }

            //ここはレスポンスを受け取っている
            //サーバは PrintWriter で送信 → クライアントは BufferedReader で受信
            String response = in.readLine();
            System.out.println("サーバの応答: " + response);
        }

        in.close();
        out.close();
        socket.close();
        System.out.println("切断しました");
    }
}

