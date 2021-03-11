
public class Lab1_2 {
	
	static int calculateDifference(int N) {
		int S1,S2;
		S1=(N*(N+1)*(2*N+1))/6;
		S2=(N*(N+1))/2;
		S2=S2*S2;
		return Math.abs(S1-S2);
	}

	public static void main(String[] args) {
		int N=10;
		System.out.println(calculateDifference(N));

	}

}
