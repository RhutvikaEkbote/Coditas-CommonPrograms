
public class Array_CommomElementsFrom2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int r[]= {2,1,6,4,8,7};
		int p[]= {4,9,0,2,7};
		
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < p.length; j++) {
				
				
				
				if (r[i] == p[j]) {
					System.out.println("duplicate no is :" +r[i]);

				}

			}
		}
		
		
		
	}

}
