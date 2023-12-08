package List;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_Numeric 
{
	public static void main(String[] args) 
	{
		TreeSet tr = new TreeSet();
		tr.add(25);
		tr.add(25);     //duplicates not allowed
		//tr.add(null);   //not allowed
		tr.add(89);
		tr.add(100);
		tr.add(650);
		tr.add(256);
		tr.add(67);
		
		System.out.println(tr);
		System.out.println(tr.size());  //6
		System.out.println(tr.isEmpty());   //false
		tr.remove(100);
		System.out.println(tr);  //[25, 67, 89, 256, 650]
		System.out.println(tr.first()); //25
		System.out.println(tr.last());  //650
		tr.pollFirst();
		System.out.println(tr);//[67, 89, 256, 650]
		tr.pollLast();
		System.out.println(tr);//[67, 89, 256]
		
		System.out.println("-----printing data using for each loop------");
		for(Object S1:tr)
		{
			System.out.println(S1);
		}
		
		System.out.println("-----printing data using Iterator------");
		Iterator i = tr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
