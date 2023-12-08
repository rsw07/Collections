package List;

import java.util.ArrayList;

public class ArayList_forloop 
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
		
		for(int i=0;i<=arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
		}
		
	}

}
