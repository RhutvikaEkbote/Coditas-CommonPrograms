
public class Array_DistinctElements {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 7 };

		int j;

		System.out.println("Distinct elements is :");
				
		for (int i = 0; i < arr.length; i++) {
			for (j = 0; j < i; j++) 
				if (arr[i]== arr[j])
				break;
				
				if(i==j) 
					System.out.print(arr[i]+" ");
				

			
		}
	}

}
