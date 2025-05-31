import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class Renshu {
    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    //ここに続きを実装していく。
    public int sumUpToN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    public int sumFromPtoQ(int p, int q){
        int sum = 0;
        if(q < p){
            return -1;
        }else{
            for(int i = p; i <= q; i++){
                sum += i;
            }
            return sum;
        }
    }

    public int sumFromArrayIndex(int[] a, int index){
        int sum = 0;
        int t = index;
        //indexは最初が0だからその分配列の大きさから1引いた数にする
        if(index > a.length-1){
            return -1;
        }else{
            for(int i = t; i <= (a.length - 1); i++){
                sum += a[i];
            }
            return sum;
        }
    }

    public int selectMaxValue(int[] a){
        int max = a[0];
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }

    public int selectMaxIndex(int[] a){
        int max = selectMaxValue(a);
        int index = 0;
        for(int i = 0; i < a.length; i++){
            if(max == a[i]){
                index = i;
                return index;
            }
        }
        return -1;

        
    }

    public void swapArrayElements(int[] p, int i, int j){
    int swap = p[i];
    p[i] = p[j];
    p[j] = swap;
    }

    public boolean swapTwoArrays(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        //配列ごとじゃなくて要素をひとつずつ交換していく必要がある
        for(int i = 0; i < a.length; i++){
            int swap = a[i];
            a[i] = b[i];
            b[i] = swap;
        }
        return true;
    }
}