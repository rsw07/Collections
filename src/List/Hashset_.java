package List;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset_ 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add(101);
		hs.add("rashmi");
		hs.add(101);  //Duplicate values are not allowed in hashset
		hs.add(null);
		hs.add("vedant");
		hs.add(569);
		hs.add(null);  //only one null value is allowed
		System.out.println(hs);
		
		System.out.println(hs.size());  //To get the count of elements present in hashset
		System.out.println(hs.isEmpty()); //To check if the hashset is empty
		hs.remove(null);            //To remove an element from hashset
		System.out.println(hs);
		
		System.out.println("-------Printing hashset data using for each loop--------");
		
		for(Object s:hs)
		{
			System.out.println(s);
		}
		
		System.out.println("-------Printing hashset data using Iterator Cursor--------");
		Iterator itr = hs.iterator();   //copy all data from hashset to iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

}
