import java.util.Scanner;

public class Armstrong_No {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter No:");
		int n= sc.nextInt();
		int num=n;
		int sum=0;
		int cube=1;
		while(n!=0) {
			int rem=n%10;
			
			cube=rem*rem*rem;
			
			sum=sum+cube;
			
			n=n/10;
			
		}
		if(num==sum) {
			System.out.println("Armstrong no...");
		}
		else
			System.out.println("Not armstrong...");
		
	}

}
