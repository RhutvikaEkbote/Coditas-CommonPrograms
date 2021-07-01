import java.util.Scanner;

public class Check_BinaryNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter no:");
		int n = sc.nextInt();
		int r = 0, c = 0;

		while (n != 0) {

			if (n % 10 == 0 || n % 10 == 1)
			c++;
			r++;
			n = n / 10;
		}

		if (c == r) {
			System.out.println("binary no");
		} else
			System.out.println("not binary no");
	}

}
