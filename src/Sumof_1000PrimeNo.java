
public class Sumof_1000PrimeNo {

	public static void main(String[] args) {
		int number=2;
		int count=0;
		long sum=0;
		while(count<1000) {
			if(isPrimeno(number)) {
				
				sum+=number;
				
				count++;
			}
			number++;
			
		}
		System.out.println(number);
	}
		
		private static boolean isPrimeno(int number) {
			
			for(int i=2;i<number/2;i++) {
				if(number%i==0) {
					return false;
				}
			}
			return true ;
		}

	}


