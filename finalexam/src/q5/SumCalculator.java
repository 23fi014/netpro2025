package q5;

public class SumCalculator implements Runnable {
    private int threadNumber;

    public SumCalculator(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += i;
        }
        System.out.println("スレッド " + threadNumber + " の計算結果: " + sum);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[50];

        // TODO 50個のスレッドを作成し, 実行する
        for (int i = 1; i <= 50; i++) {
            Runnable task = new SumCalculator(i);
            threads[i] = task;
            threads[i].start();
        }

        System.out.println("すべてのスレッドが終了しました。");
    }
}