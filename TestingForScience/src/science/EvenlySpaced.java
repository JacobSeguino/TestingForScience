package science;

public class EvenlySpaced {
	public static void main(String[] args) {
		evenlySpaced(2, 4, 6);
	}
	
	public static boolean evenlySpaced(int a, int b, int c) {
		  int hold = 0;
		  if(a<b){
		   hold = a;
		   a = b;
		   b = hold;}
		   System.out.println(a+", "+b+", "+c);
		  if(a<c){
		   hold = a;
		   a = c;
		   c = hold;}
		   System.out.println(a+", "+b+", "+c);
		  if(b<c){
		   hold = b;
		   b = c;
		   c = hold;}
		   System.out.println(a+", "+b+", "+c);
		   return (Math.abs(a-b)== Math.abs(b - c));
		}
}
