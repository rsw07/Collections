//TreeSet => allowsonly homogeneous data

package List;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_string
{
	public static void main(String[] args) 
	{
		TreeSet tr = new TreeSet();
		tr.add("rashmi");
		tr.add("rashmi");   //-->duplicate values are not allowed
		tr.add("vedant");
		tr.add("shrutika");
		tr.add("myra");
		tr.add("ciana");
		//tr.add(101);      -->don't allow heterogeneous data
		//tr.add(null);     -->null values are not allowed
		System.out.println(tr);
		
		System.out.println(tr.size());  //5
		System.out.println(tr.isEmpty());  //false
		tr.remove("myra");
		System.out.println(tr);
		System.out.println(tr.first());
		System.out.println(tr.last());
		tr.pollFirst();
		System.out.println(tr);
		tr.pollLast();
		System.out.println(tr);
		
		System.out.println("-----printing data using for each loop------");
		for(Object S1:tr)
		{
			System.out.println(S1);
		}
		
		System.out.println("-----printing data using Iterator------");
		Iterator i = tr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
