package pretest;

public class CountTenRunnableImpleC implements Runnable {
    private int interval;

    public CountTenRunnableImpleC(int interval) {
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                //Tread.sleep()の単位はミリ秒だから1000をかける
                //大きめの整数を扱うときはintよりもlongがおすすめ
                Thread.sleep(interval * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("スレッドID:" + Thread.currentThread().getName()
                    + " カウンター:" + i);
        }
    }
}
