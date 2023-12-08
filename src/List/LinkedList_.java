package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_ 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("rashmi");
		l.add(59.7f);
		l.add(null);
		l.add("rashmi");
		System.out.println(l);
		System.out.println(l.size());    //5
		System.out.println(l.isEmpty()); //false
		System.out.println(l.get(2));    //59.7
		l.set(3, "hello");
		System.out.println(l);
		l.add(3,"zomato");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		
		System.out.println("-----printing all data using for loop-------");
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("-----printing all data using for each loop-------");
		for(Object s:l)
		{
			System.out.println(s);
		}
		
		System.out.println("-----printing all data using iterator cursor-------");
		Iterator itr = l.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-----printing all data using Listiterator cursor-------");
		ListIterator litr = l.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}

}
