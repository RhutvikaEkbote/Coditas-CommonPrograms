import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Map_SortByValue {
public static void main(String[] args) {
	HashMap <Integer , String> hm = new HashMap();
	
	hm.put(8, "maths");
	hm.put(2, "physics");
	hm.put(4, "english");
	hm.put(7, "hindi");
	hm.put(5, "marathi");
	
	System.out.println("Befour sorting:");
	
	Iterator <Integer> it = hm.keySet().iterator();
	while(it.hasNext()) {
		
		int key =(int)it.next();
		System.out.println("Roll no:"+key+"  Name:"+hm.get(key));
	}
	System.out.println();
	System.out.println("After sorting:");
	
	
	Map<Integer,String> map = new HashMap<Integer,String>();
	
	TreeMap <Integer,String>tm = new TreeMap<Integer,String>(hm);
	
	Iterator itr = tm.keySet().iterator(); 
	
    while(itr.hasNext()) {
		
		int key =(int)itr.next();
		System.out.println("Roll no:"+key+"  Name:"+hm.get(key));
	}
	
	
}
}
