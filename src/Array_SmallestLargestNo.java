import java.util.Arrays;

public class Array_SmallestLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 8, 1, 3, 6, 2, 9, 4, 3 };
		int temp = 0;

		Arrays.parallelSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Smallest Element In Array Is:"+arr[0]);
		System.out.println("Largest Element In Array Is:"+arr[arr.length-1]);

	}

}
