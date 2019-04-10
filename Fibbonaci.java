import java.util.Scanner;



public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Fibonacci Level:");
		System.out.println(fibo(scan.nextInt()));
		
		
	}

	private static int fibo(int n) {
		
		if(n==0) 
			return(1);
		if(n==1) 
			return(1);
		
		return fibo(n-1) + fibo(n-2);
	}

}
