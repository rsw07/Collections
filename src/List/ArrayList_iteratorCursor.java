package List;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList_iteratorCursor 
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
		
		System.out.println("--------------Printing data using iterator cursor-----------------");
		//copy all data from arraylist to iterator
		Iterator itr =arr.iterator();
		//get each data from iterator object
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
