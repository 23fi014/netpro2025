import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class birthdayServer {


    private static String serverProcess(String gift, String giftColor) {
        StringBuilder sb = new StringBuilder();
        //sb.append("***");//sb.append("pz1");
        sb.append("もらったプレゼントは");
        sb.append(giftColor);
        sb.append("の");
        sb.append(gift);
        //sb.append("***");//sb.append("pz2");
        String result = sb.toString();
        return result;
    }

    public static void main(String arg[]) {
        try {
            /* 通信の準備をする */
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5051など) → ");
            int port = scanner.nextInt();
            scanner.close();
            System.out.println("localhostの" + port + "番ポートで待機します");
            ServerSocket server = new ServerSocket(port); // ポート番号を指定し、クライアントとの接続の準備を行う

            Socket socket = server.accept(); // クライアントからの接続要求を待ち、
            // 要求があればソケットを取得し接続を行う
            System.out.println("接続しました。相手の入力を待っています......");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            birthdayPresent present = (birthdayPresent) ois.readObject();// Integerクラスでキャスト。

            String msgPresent = present.getMessage();
            System.out.println("メッセージは" + msgPresent);
            String presentFromClient = present.getGift();
            String giftColor = present.getColor();
            int birthday = present.getBirthday();
            System.out.println("プレゼントの内容は" + giftColor + "の" + presentFromClient + "です！");
            String name = present.getName();

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            birthdayPresent response = new birthdayPresent();
            response.setMessage("お誕生日おめでとう！\n" + presentFromClient + "ありがとう。\nプレゼントのお返しです");
            response.setGift(serverProcess(presentFromClient, giftColor));
            response.setBirthday(birthday);
            response.setColor(giftColor);
            response.setName(name);

            oos.writeObject(response);
            oos.flush();

            // close処理
            ois.close();
            oos.close();
            // socketの終了。
            socket.close();
            server.close();

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.out.println("ポート番号が不正、ポートが使用中です");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}