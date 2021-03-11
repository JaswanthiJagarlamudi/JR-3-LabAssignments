package Lab_3;
import java.util.*;

public class Exercise2 {
	public static void getImage(String str) {
		StringBuffer buffer=new StringBuffer(str).reverse();
		 
		System.out.println(buffer.toString());
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		System.out.print(str+"|");
		getImage(str);
	}

}
