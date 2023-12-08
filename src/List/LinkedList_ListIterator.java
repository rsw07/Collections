package List;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_ListIterator 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("rashmi");
		l.add(59.7f);
		l.add(null);
		
		ListIterator li = l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}
