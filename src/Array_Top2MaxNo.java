import java.util.Arrays;

public class Array_Top2MaxNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 8, 1, 3, 6, 2, 9, 4, 3 };
		int temp = 0;

		Arrays.parallelSort(arr);
		
		
		System.out.println("Largest Element In Array Is:"+arr[arr.length-1]);
		System.out.println("Second largest Element In Array Is:"+arr[arr.length-2]);
	}

}
