import java.util.Hashtable;


public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<String , Integer> ht = new Hashtable<String, Integer>();
		ht.put("Legs", 4);
		ht.put("Eyes", 2);
		ht.put("Mouth",1);
		
			System.out.println("the Legs of cat is ="+ht.replace("Legs", 3));
			System.out.println("the Legs of cat is ="+ht.get("Legs"));

			System.out.println("the Eyes of cat is ="+ht.get("Eyes"));
			System.out.println("the Mouth of cat is ="+ht.get("Mouth"));
			boolean b=ht.containsValue(3);
			System.out.println(b);
		
			System.out.println(ht.remove("Legs"));

	}

}
