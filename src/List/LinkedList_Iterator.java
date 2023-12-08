package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Iterator 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("rashmi");
		l.add(59.7f);
		l.add(null);
		
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
