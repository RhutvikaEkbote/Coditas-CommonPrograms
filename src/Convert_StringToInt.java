import java.util.Scanner;

public class Convert_StringToInt {

			
			public static void main(String a[]) {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("enter no :");
				String numStr=sc.next();
				
				char ch[] = numStr.toCharArray();
				
				int sum = 0;
				
				int zeroAscii = (int)'0';
				
				for (char c:ch) {
					int tmpAscii = (int)c;
					sum = (sum*10)+(tmpAscii-zeroAscii);
				}
				System.out.println(sum);
				
			}
		
	}


