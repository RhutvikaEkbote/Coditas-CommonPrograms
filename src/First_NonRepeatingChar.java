import java.util.Scanner;

public class First_NonRepeatingChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String s = sc.next();
		for (Character ch : s.toCharArray()) {
			if (s.indexOf(ch) == s.lastIndexOf(ch)) {
				System.out.println("First non repeat character : " + ch);
				break;
			}
		}

	}

}
