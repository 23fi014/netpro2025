public class Calc3MethodTestInstance {
	

	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		//Calc3MethodTestInatance calc3=new Calc3MethodTestInatance();
		//calc3.printResult(calc3.func(x,y));
        int z=Calc3MethodTestInstance.func(x, y);
        Calc3MethodTestInstance.printResult(z);

		
	}

	//static
	public Calc3MethodTestInstance(){

	}

	//返り値は整数型
	public static int func(int a, int b) {
        double PAI=3.14;
		return (int) (2 * a + b*PAI);
	}

	//返り値は無い
	public static void printResult(int z){
		System.out.println("計算結果は" + z + "です。");
	}
}