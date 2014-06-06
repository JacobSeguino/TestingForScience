package science;

public class fibb {
	static int x = 0;
	static int y = 1;
	
	public static void main(String[] args){
		fibbi(2);
		System.out.println("");
		System.out.println(fibonacci(2));
	}
	
	public static void fibbi(int limit){
		while( x < limit){
			System.out.print(x +" " + y+" ");
			x += y;
			y += x;
		}
	}
	public static int fibonacci(int n) {
		if(n==0){
			return 0;}
		if(n==1){
		   return 1;}
		if(n==2){
		   return 1;}
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
