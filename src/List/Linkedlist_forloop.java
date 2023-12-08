package List;

import java.util.LinkedList;

public class Linkedlist_forloop 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("rashmi");
		l.add(59.7f);
		l.add(null);
		
		for(int i=0;i<=l.size()-1;i++)
		{
			System.out.println(l.get(i));
		}
		
	}

}
