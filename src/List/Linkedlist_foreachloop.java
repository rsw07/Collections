package List;

import java.util.LinkedList;

public class Linkedlist_foreachloop
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("rashmi");
		l.add(59.7f);
		l.add(null);
		
		for(Object b:l)
		{
			System.out.println(b);
		}
		
	}

}
