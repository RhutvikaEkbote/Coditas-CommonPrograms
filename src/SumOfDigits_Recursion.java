import java.util.Scanner;

public class SumOfDigits_Recursion {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int remainder=n%10;
			sum=sum+remainder;
			n=n/10;	
		}
		System.out.println(sum);
	}
}
