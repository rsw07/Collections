package List;

import java.util.Enumeration;
import java.util.Vector;

public class vector_Enumeration 
{
	public static void main(String[] args)
	{
		Vector v = new Vector();
		v.add("Rashmi");
		v.add(101);
		v.add(45.4f);
		v.add('s');
		v.add(null);
		
		//copy all data from vector to enumeration
		Enumeration obj=v.elements();
		
		//to print all data from enumeration
		while(obj.hasMoreElements())
		{
			System.out.println(obj.nextElement());
		}
	}

}
