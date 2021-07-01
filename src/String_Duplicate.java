import java.util.Scanner;

public class String_Duplicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string :");
		String str=sc.next();
		
		
		char[] ch = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("duplicate char is :" + ch[i]);

				}

			}
		}
	}

}
