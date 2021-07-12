
public class Array_RemoveDuplicates {

	
	public static int removeduplicate(int arr[],int n) {
		if(n==1 || n==0) {
			return n;
		}
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			
			}
		}
		
		temp[j++]=arr[n-1];
		
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		
		return j;
		
	}
	

	public static void main(String[] args) {
		int arr[]= {10,10,20,30,40,50};

		int length=arr.length;
		
		length=removeduplicate(arr, length);
		
		for(int i=0;i<length;i++)
			System.out.println(arr[i]+" ");
	
	}
}
