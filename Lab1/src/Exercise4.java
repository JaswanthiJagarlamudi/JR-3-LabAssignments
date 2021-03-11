import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=s.nextInt();
		for(int i=1;i<=N;i++)
        {
            int p=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    p++;
            }
            if(p==2)
                    System.out.print(" "+i);
 
        }
	}

}
