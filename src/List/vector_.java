package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;


public class vector_ 
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		//To add elements in vector
		v.add("Rashmi");
		v.add(101);
		v.add(45.4f);
		v.add('s');
		v.add(null);
		v.add('s');
		System.out.println(v);
		
		//To get capacity of vector
		System.out.println(v.capacity());  //10
		
		//to check if the vector is empty
		System.out.println(v.isEmpty());   //false
		
		//to get size of a vector
		System.out.println(v.size());   //6
		
		//to get element from specified index
		System.out.println(v.get(2));   //45.4
		
		//to modify /update element of vector
		v.set(4, 536);
		System.out.println(v);
		
		//to add element in between vector by maintaining previous data
		v.add(2,"shrutika");
		System.out.println(v);
		
		//to remove element from vector
		v.remove(4);
		System.out.println("-------Printing all vector data using for loop-----------");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("-------Printing all vector data using for each loop-----------");
		for(Object s1:v)
		{
			System.out.println(s1);
		}
		System.out.println("-------Printing all vector data using Iterator cursor----------");
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------Printing all vector data using listiterator-----------");
		ListIterator litr = v.listIterator();		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("-------Printing all vector data using Enumeration-----------");
		Enumeration enu=v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}

}
