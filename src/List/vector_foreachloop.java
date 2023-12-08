//printing all vector data using for each loop

package List;

import java.util.Vector;

public class vector_foreachloop 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Rashmi");
		v.add(101);
		v.add(45.4f);
		v.add('s');
		v.add(null);
		for(Object o:v)
		{
			System.out.println(o);
		}
	}

}
