//printing all vector data using iterator

package List;

import java.util.Vector;

import java.util.Iterator;

public class vector_iterator 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Rashmi");
		v.add(101);
		v.add(45.4f);
		v.add('s');
		v.add(null);
		
		//Copy all data from vector to iterator
		Iterator itr = v.iterator();
		
		//To print all data
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
