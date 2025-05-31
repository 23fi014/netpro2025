package q2;

public class KuKu {
    public static void main(String[] args) {
        // TODO
        int result = 0;
        for(int i = 1; i <= 9; i++){
            
            for(int j = 1; j <= 9; j++){
                result = i * j;
                if(result<10){
                    Integer a = Integer.valueOf(result);
                    String num = a.toString();
                    System.out.print("| " + num);
                }else{
                    System.out.print("|" + result);
                }
            }
            System.out.println("|");
        }
    }
}