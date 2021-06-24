import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, reverse = "";
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter string to check palindrom:");
		original = Sc.next();
		int n = original.length();
		for (int i = 0; i < n; i++) {
			char ch = original.charAt(i);

			reverse = ch + reverse;
		}
		System.out.println("reverse is :" + reverse);
		if (original.equals(reverse)) {
			System.out.println("String is palindrom");
		} else
			System.out.println("String is not palindrom");

	}

}
