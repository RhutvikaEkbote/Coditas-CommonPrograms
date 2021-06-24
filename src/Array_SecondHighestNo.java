import java.util.Arrays;

public class Array_SecondHighestNo {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 9, 2, 5, 3, 8 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}
		System.out.println();
		int n[] = new int[100];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {

					n[i] = arr[i];

				}

			}
		}

		int count = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] == arr[1]) {
				System.out.println("second highest is duplicate number :" + n[i]);
				System.exit(0);
			} else {
				if (count == 0) {
					System.out.println("second highest is :" + arr[1]);
					count++;
				}

			}
		}

	}

}
