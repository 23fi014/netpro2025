package q1;

public class PrimeTwinMain {
    public static void main(String[] args) {
		    // TODO 双子素数をスペース区切りのペアで出力する
        int max = 40000;
        printPrimes(max);

       
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimes(int max) {
        for (int i = 2; i <= max; i++) {
            int j = i + 2;
            if (isPrime(i) && isPrime(j)) {
                System.out.println(i + " " + j);
            }
        }
        System.out.println();
    }

}