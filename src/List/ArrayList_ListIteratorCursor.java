package List;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_ListIteratorCursor 
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add(101);
		a.add(78.6f);
		a.add(true);
		a.add(null);
		a.add('f');
		
		//copy all data from arraylist to listiterator
		ListIterator litr =a.listIterator();
		//get each data from ListIterator object
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	}

}
