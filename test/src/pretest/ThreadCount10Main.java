package pretest;

public class ThreadCount10Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Runnable task = new CountTenRunnableImpleC(i);
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
