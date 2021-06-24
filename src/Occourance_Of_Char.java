import java.util.HashMap;
import java.util.Scanner;

public class Occourance_Of_Char {
	 public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter string:");
	      String str = sc.next();
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println(hMap);
	   }
}