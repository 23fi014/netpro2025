import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.Socket; //ネットワーク関連のパッケージを利用する
import java.util.Scanner;

public class birthdayClient {

    public static void main(String arg[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5051など) → ");
            int port = scanner.nextInt();
            System.out.println("localhostの" + port + "番ポートに接続を要求します");
            Socket socket = new Socket("localhost", port);
            System.out.println("接続されました");

            System.out.println("プレゼントを送ります");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            System.out.println("誕生日の方の名前を入力してください(例:alice) ↓");
            String name = scanner.next();
            System.out.println("メッセージを入力してください(例:ハッピーバースデイ) ↓");
            String message = scanner.next();
            System.out.println("プレゼントの内容を入力してください(例:スニーカー、服) ↓");
            String gift = scanner.next();
            System.out.println("ほしいプレゼントの色を入力してください(例:赤、ゴールド) ↓");
            String color = scanner.next();
            System.out.println("誕生日に日付を入力してください(例:20041020) ↓");
            int birthday = Integer.parseInt((scanner.next()));
            
            scanner.close();

            birthdayPresent present = new birthdayPresent();
            present.setMessage(message);
            present.setGift(gift);
            present.setBirthday(birthday);
            present.setColor(color);
            present.setName(name);

            oos.writeObject(present);
            oos.flush();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            birthdayPresent returnPresent = (birthdayPresent) ois.readObject();

            int replayBirthday = returnPresent.getBirthday();
            System.out.println("誕生日は" + replayBirthday + "です！");
            String replayMsg = returnPresent.getMessage();
            System.out.println("サーバからのメッセージは" + replayMsg);
            String replayGift = returnPresent.getGift();
            //String replayColor = returnPresent.getColor();
            String replayName = returnPresent.getName();
            System.out.println(replayName + "の" + replayGift + "です！");

            ois.close();
            oos.close();
            socket.close();

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.err.println("ポート番号が不正か、サーバが起動していません");
            System.err.println("サーバが起動しているか確認してください");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}
