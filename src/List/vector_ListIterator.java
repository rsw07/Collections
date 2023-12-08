//printing all vector data using listiterator cursor

package List;

import java.util.ListIterator;
import java.util.Vector;

public class vector_ListIterator 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Rashmi");
		v.add(101);
		v.add(45.4f);
		v.add('s');
		v.add(null);
		
		//copy all data from vector to listiterator
		ListIterator litr = v.listIterator();
		
		//print all data
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
	}

}
