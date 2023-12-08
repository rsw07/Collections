//To print all data of vector using for loop

package List;

import java.util.Vector;

public class vector_forloop 
{
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add("Rashmi");
		v.add(101);
		v.add(45.4f);
		v.add('s');
		v.add(null);
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
	}

}
