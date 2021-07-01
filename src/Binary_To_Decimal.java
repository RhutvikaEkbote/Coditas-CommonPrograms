import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Binary No:");
		int binary= sc.nextInt();
		int decimal=0;
		int n=0;
		while(binary!=0) {
			int rem=binary%10;
			decimal+=rem*Math.pow(2, n);
			binary=binary/10;
			n++;
		}
		
		System.out.println("Decimal conversion is :"+decimal);
	}

}
