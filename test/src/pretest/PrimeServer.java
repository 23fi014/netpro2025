package pretest;

import java.io.*;
import java.net.*;
//*;ioはインプットアウトプット
//netはネットワーク通信のため

//クライアントから数字を受け取る
//素数判定
//判定結果の返信
//qまたはexitを受け取ったら終了
public class PrimeServer {
    public static void main(String[] args)throws IOException{
        //まずサーバにつなぐ
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
            if(inputline.equalsIgnoreCase("q") || inputline.equalsIgnoreCase("exit")){
                System.out.println("終了コマンドを受信");
                break;        
            }
            try{
                int num = Integer.parseInt(inputline);
                boolean result = isPrime(num);
                if(result){
                    System.out.println(num + "is Prime");
                }else {
                    System.out.println(num + "is non-Prime");
                }

            } catch(NumberFormatException e){
                System.out.println("エラー：　数字を入力してください");

            }

        }

        //全部閉じる
        in.close();
        out.close();
        clienSocket.close();
        serverSocket.close();
        System.out.println("サーバ終了");

    }



    public static boolean isPrime(int num){
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
