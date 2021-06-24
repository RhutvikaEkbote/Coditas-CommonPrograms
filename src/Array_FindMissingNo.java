
public class Array_FindMissingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[101];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
			;
		}

		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length;) {
				if (arr[j] == arr[i] + 1) {
					if (count == 100) {
						System.out.println("no missing:" + count);
						count++;
						continue;
					}
				} else {
					System.out.println("no is missisng" + arr[i]);

				}
			}
		}
	}
}
