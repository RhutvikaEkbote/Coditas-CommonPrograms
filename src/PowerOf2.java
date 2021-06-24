import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No : ");
		int n= sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			if(i*i==n) {
				System.out.println("This is square root of "+i);
			}
			
		}
		
		System.out.println("Thank You");
	}

}
