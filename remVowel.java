import java.util.Arrays; 
import java.util.List; 

public class remVowel
{	 
	static String remVowel(String str) 
	{ 
		Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
		
		List<Character> al = Arrays.asList(vowels); 
		
		StringBuffer sb = new StringBuffer(str); 
		
		for (int i = 0; i < sb.length(); i++) { 
			
			if(al.contains(sb.charAt(i))){ 
				sb.replace(i, i+1, "") ; 
				i--; 
			} 
		} 
		
		
		return sb.toString(); 
	} 
	public static void main(String[] args) 
	{ 
		String str = "GeeeksforGeeks - A Computer Science Portal for Geeks"; 
		
		System.out.println(remVowel(str)); 
	} 
} 
