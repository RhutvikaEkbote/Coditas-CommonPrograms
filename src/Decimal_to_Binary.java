import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string : ");
		int n = sc.nextInt();
		int[] binary = new int[20];
		int i = 0;
		while (n != 0) {
			int remainder = n % 2;
			binary[i++] = remainder;
			n = n / 2;

		}
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binary[j]);
	}

}
