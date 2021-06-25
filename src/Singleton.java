
public class Singleton {

	
	private static Singleton s=null;
	public String str;
	
	private Singleton() {
		str="singleton class";
	}
	
	public static Singleton getinstance() {
		if(s==null)
			s=new Singleton();
		return s;
	}
	
	public static void main(String[] args) {
		Singleton a = Singleton.getinstance();
		System.out.println(a);

	}

	

}
