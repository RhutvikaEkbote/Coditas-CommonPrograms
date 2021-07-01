import java.util.Scanner;

public class Fibonnic_series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range :");
		int range = sc.nextInt();
		int k;
		int i = 0, j = 1;
		System.out.print(i + " " + j + " ");
		while (j <= range) {
			k = i + j;
			i = j;
			j = k;
			if (j <= range) {
				System.out.print(j + " ");
			}
		}

	}

}
