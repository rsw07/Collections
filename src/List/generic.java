//to convert implementation class into homogeneous
//We can do it with any implementation class
package List;

import java.util.TreeSet;

public class generic 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> tr = new TreeSet<Integer>();
		tr.add(101);
		tr.add(16);
		tr.add(89);
		tr.add(500);
		
		for(Integer s1:tr)
		{
			System.out.println(s1);
		}
	}

}
