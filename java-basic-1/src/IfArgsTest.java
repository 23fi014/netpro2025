//結果表示されない
public class IfArgsTest {
	public static void main(String[] args) { 
		int x=Integer.parseInt(args[0]);
		/*以下を改造する。**/
        if(x >= 7){
            System.out .println(x + "is big number");
        }else if(x >= 4){
            System.out.println(x + "is middle number");
        }else if(x >= 1){
            System.out.println(x + "is small number");
        }else{
            System.out.println(x + "out of scope");
        }
		// System.out.println(x+" is Big Number");
		

	}//main end
}//class end

//xが7,8,9ならbig number、
//xが4,5,6ならmiddle number、
//xが1,2,3ならsmall number、
//xがそれ以外(10や-1なら)ならout of scopeと表示するプログラム