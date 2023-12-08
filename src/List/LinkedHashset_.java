package List;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_ 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("rashmi");
		lhs.add(105);
		lhs.add(null);
		lhs.add(45.8f);
		lhs.add(null);
		lhs.add("rashmi");
		System.out.println(lhs);   //order of insertion maintained
		
		System.out.println(lhs.size());  //4
		System.out.println(lhs.isEmpty());  //false
		lhs.remove(105);
		System.out.println(lhs);
		System.out.println("--------printing all data using for each loop--------");
		for(Object s:lhs)
		{
			System.out.println(s);
		}
		System.out.println("--------printing all data using iterator--------");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
