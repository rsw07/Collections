package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class practice 
{
	public static void main(String[] args)
	{
			ArrayList arr = new ArrayList();
			arr.add(536);
			arr.add("Myra");
			arr.add(12.65f);
			arr.add(null);
			arr.add(false);
			arr.add('v');
			arr.add(536);
			
			for(Object s : arr)
			{
				System.out.println(s);
			}
			
	
	}
}
