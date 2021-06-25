import java.util.Scanner;

public class Swap_Variables {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no:");
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		System.out.println("unswapped a:"+a+" & b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped a:"+a+" & b:"+b);

		
	}

}
