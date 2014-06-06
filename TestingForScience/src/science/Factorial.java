package science;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 8;
		fact(num);
		factfor(num);
	}
	
	public static void fact(int start){
		int total = start;
		while(start > 1){
			total *= (start-1);
			start -=1;
		}
		System.out.println(total);
	}
	
	public static void factfor(int start){
		int total=1;
		for(int i = start; i > 1; i--){
			total *= i;
		}
		System.out.println(total);
	}
	public static int factorial(int n) {
		  if (n == 1){
			  return 1;}
		  return n * factorial(n-1);
		}

}
