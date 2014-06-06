package science;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

	public static void main(String[] args) {
//		int[] beginArray = intiArray(52);
//		System.out.println(Arrays.toString(beginArray));
//		int[] endArray = shuffle(beginArray);
//		System.out.println(Arrays.toString(endArray));
//		int x = 9;
//		System.out.println(x/10);
		int[] nums = {1, 6, 4}; 
		System.out.println(array6(nums, 0)+"");
	}
	
	//creates and fills an array from 0 ... num
	public static int[] intiArray(int num){
		int[] numArray = new int[num];
		for(int i = 0; i < num; i++){
			numArray[i] = i+1;
		}
		return numArray;
	}
	
	//takes an array and "shuffles" it
	public static int[] shuffle(int[] deck){
		Random rnd = new Random();
	    for (int i = deck.length - 1; i > 0; i--)
	    {
	      int index = rnd.nextInt(i + 1);
	      int a = deck[index];
	      deck[index] = deck[i];
	      deck[i] = a;
	    }
	    return deck;
	}
	static boolean ans;
	public static boolean array6(int[] nums, int index) {
		System.out.println("the index is " + index); 
		System.out.println("nums["+index+"] = "+nums[index]);
		if(nums[index] == 6){
	      System.out.println("n = true");
		  return true;
		}
		System.out.println(nums.length+"");
		if(index < nums.length-1){
		  System.out.println("n = false");
		  ans=false;
		  index++;
		  array6(nums, index);
		}
		return ans;
	}

}
