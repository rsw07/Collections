package List;

import java.util.ArrayList;

public class ArrayList_foreach_loop
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
		
		for(Object s1:arr)
		{
			System.out.println(s1);
		}
	}

}
