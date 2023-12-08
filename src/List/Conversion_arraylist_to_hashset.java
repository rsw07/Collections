package List;

import java.util.ArrayList;
import java.util.HashSet;

public class Conversion_arraylist_to_hashset 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Shrutika");
		al.add(655);
		al.add("vedant");
		al.add(null);
		al.add(655);
		al.add(null);
		al.add(45.3f);
		System.out.println(al);
		
		//Create the object of hashtable and provide objectname of arraylist into its constructor
		
		HashSet hs = new HashSet(al);
		System.out.println(hs);
	}

}
