package science;

import java.sql.Timestamp;

public class TimeIsEverywhere {
	
	public static void main(String[] args){
		Timestamp timey = new Timestamp((new java.util.Date()).getTime());
		
		System.out.println(""+timey.getTime());
	}
	
}
