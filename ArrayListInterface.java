import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;


public class ArrayListInterface {
		
	public static void main (String []args){
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hussain");
		a.add("vivekanada");
		a.add("Shivaji");
		String str = a.get(0);
		//System.out.println(a.size());
		System.out.println(str);
		System.out.println( str=a.get(1));
		System.out.println(str=a.get(2));
		
		System.out.println("****************************************");
		Iterator<String> itr = a.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("******************************************");
		Hashtable<String, Integer> h = new Hashtable<String, Integer>();
		h.put("Rayalaseema", 0);
		h.put("kadapa", 1);
		h.put("amaravathi", 2);
		
		System.out.println(h.containsKey("kadapa"));
		int n=h.get("amaravathi");
		System.out.println(n);
		h.remove("kadapa");
		h.size();
		System.out.println(h.size());
		h.put("Mydukur", 3);
		System.out.println(h.size());
		System.out.println(h.contains("kadapa"));
			
	}
}
