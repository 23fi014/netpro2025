import java.util.PriorityQueue;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        //PriorityQueueは、デフォルトで最小値を先に出す順序付けを用います。
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(2);

        //poll()
        //キューの先頭を取得および削除します。キューが空の場合はnullを返します。
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll()); // 最小の要素から出力
        }
    }
}