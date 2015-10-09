package uebung;

public class Uebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibfol(35);
		}
			 static int quadrat(int x){return x*x;}
			
			 
		static boolean Wahroderfalsch(){
			return 2*2 ==4 && 8 == 5;
		}
	
 /*static int fac(int x){
	 int a = 1;
	 while (x>0){ a= a*x;x = x-1;}
	 return a;*/
		static int fac(int h){return h==0?1:h*fac(h-1);}
		
		/*static int fib(int i){return i<=1?i:fib(i-1)+fib(i-2);}*/
		static int fib(int i){
			if (i<=0){return 0;}
			else if(i==1 || i==2){return 1;}
			else{return fib(i-2)+fib(i-1);}
		}
		
		static void fibfol(int k){
			while (k >= 1){
				System.out.print(fib(k) + " , ");
				k = k-1;
			}
			System.out.print("0");
		}
}
