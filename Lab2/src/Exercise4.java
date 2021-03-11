import java.util.*;


public class Exercise4 {
	public static int modifyArray(int arr[], int N){  
        if (N==0 || N==1){  
            return N;  
        }  
        int[] temp = new int[N];  
        int j = 0;  
        for (int i=0; i<N-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[N-1];     
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int N=sc.nextInt();
		int[] a=new int[N];
		System.out.println("Enter the integers of the array");
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		N = modifyArray(a, N);  
        //printing array elements  
        for (int i=0; i<N; i++)  
           System.out.print(a[i]+" ");  
     
		
	}
	
 }

	
	
         
        
	

	