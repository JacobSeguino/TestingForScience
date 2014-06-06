package science;

public class FizzBuzz {

	public static void main(String[] args) {
		FiBu(1, 3000);

	}
	public static int FiBu(int start,int max){
		if(max < start){
			return 0;
		}
		if(start%3==0 || start%5==0){
			if(start%3==0){
				System.out.print("Fizz");
			}
			if(start%5==0){
				System.out.print("Buzz");
			}
			System.out.print(" ");
		}else{
 		System.out.print(start+" ");
		}
		start++;
		return FiBu(start , max);
	}
}
