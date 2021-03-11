import java.util.Scanner;

public class Lab1_3 {
	
	static boolean checkNumber(int N) {
		String s = Integer.toString(N);
		char ch;
		int flag=0;
		
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			if(ch>s.charAt(i+1))
				flag=1;
			    break;
		}
		if(flag==1)
			return false;
		else
			return true;
				
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=s.nextInt();
        System.out.println(checkNumber(N));
	}

}
