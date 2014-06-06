package science;

public class Pall {

	public static void main(String[] args) {
		pallin("xo?x?o?", 5, 10);

	}
	
	public static void pallin(String pal,int xcost, int ocost){
		char nu = 'x';
		if(xcost > ocost){
			nu = 'o';
		}else{
			nu = 'x';
		}
			for(int i = 0;i < pal.length(); i++){
				char[] palChars = pal.toCharArray();
				if (pal.charAt(i) == '?'){
					if(pal.charAt(i) ==  pal.charAt(pal.length()-(i+1))){
						palChars[i] = nu;
						pal = String.valueOf(palChars);
					}else{
						palChars[i] = palChars[pal.length()-(i+1)];
						pal = String.valueOf(palChars);
					}
				}
			}
			System.out.println(pal);
	}

}
