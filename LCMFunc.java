import java.io.*; 
import java.lang.*; 

class LCMFunc { 
	
	public static int findLCM(int a, int b) 
	{ 
		int lar = Math.max(a, b); 
		int small = Math.min(a, b); 
		for (int i = lar; ; i += lar) { 
			if (i % small == 0) 
				return i; 
		} 
	} 
	
	public static void main(String [] argc) 
	{ 
		int a = 5, b = 7; 
		System.out.println( "LCM of " + a + " and "
			+ b + " is " + findLCM(a, b)); 
		
	} 
}
