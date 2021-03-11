package Lab_3;

import java.util.Scanner;

public class Exercise3 {
	
	static boolean isVowel(char ch) 
	{ 
		if (ch != 'a' && ch != 'e' && ch != 'i'
				&& ch != 'o' && ch != 'u') 
		{ 
			return false; 
		} 
		return true; 
	} 

	
	public static String alterString(char[] str) {
		for (int i = 0; i < str.length; i++) 
		{ 
			if (!isVowel(str[i])) 
			{ 

				
				if (str[i] == 'z') 
				{ 
					str[i] = 'b'; 
				} 
				else
				{ 
					str[i] = (char) (str[i] + 1); 
					if (isVowel(str[i])) 
					{ 
						str[i] = (char) (str[i] + 1); 
					} 
				} 
			} 
		} 
		return String.valueOf(str);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.println(alterString(str.toCharArray()));

	}

}
