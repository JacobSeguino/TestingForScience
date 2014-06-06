package science;

public class Reverse {
	public static void main(String[] args) {
		frontBack("hello");
		//FirstReverse("hello");
	}
	public static String frontBack(String str) {
		  char[] startChars = str.toCharArray();
		  char[] endChars = new char[str.length()];
		  int j = 0;
		  for(int i=str.length()-1; i >=0; i--){
		    endChars[j] = startChars[i];
		    j++;
		  }
		  System.out.println(String.valueOf(endChars));
		  return String.valueOf(endChars);
		}
	 public static String FirstReverse(String str) { 
		  
		    char[] strChars = str.toCharArray();
		    char[] endChars = new char[str.length()-1];
		    for(int i = 0; i < str.length(); i++){
		      endChars[i] = strChars[(str.length()-1)-i];}
		    str = String.valueOf(endChars);
		    System.out.println(str);   
		    return str;
		    
		  } 

}
