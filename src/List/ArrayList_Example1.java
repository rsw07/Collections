//ArrayList


package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Example1
{
	public static void main(String[] args) 
	{
		ArrayList obj = new ArrayList();
		//add data into arraylist
		obj.add("Rashmi");
		obj.add('A');
		obj.add(101);
		obj.add(null);
		obj.add(10.23f);
		obj.add(true);
		obj.add("Rashmi");
		
		
		//display arraylist
		System.out.println(obj);
		
		//print the size of Arraylist
		System.out.println("Size of arraylist is: "+obj.size());
		
		//check whether arraylist is empty
		System.out.println(obj.isEmpty());
		
		//Get data from specific index
		System.out.println(obj.get(2));
		
		//update the data for 3rd index 
		obj.set(3, "vedant");
		System.out.println(obj);
		
		//insert data in between arraylist by maintaining previous data
		obj.add(4,105);           //right shift operation
		System.out.println(obj); 
		
		//remove data from arraylist
		obj.remove(1);
		System.out.println(obj);
		
		System.out.println("-------------printing all data using iterator cursor------------------");
		//copy all data from arraylist to iterator
		Iterator itr = obj.iterator();    
		//get each data from iterator object
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("-------------printing all data using ListIterator cursor------------------");
		ListIterator li=obj.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("------------printing all data using for loop------------------");
		for(int i=0;i<=obj.size()-1;i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("------------printing all data using for each loop------------------");
		for(Object s1:obj)
		{
			System.out.println(s1);
		}
	}

}
