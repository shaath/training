package selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset 
{

	public static void main(String[] args)
	{
		Set<String> s=new HashSet<String>();
		
		s.add("Sandhya");
		s.add("Swapna");
		s.add("sarala");
		s.add("sravanthi");
		s.add("Swapna");
		
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext())
		{
			String temp=it.next();
			System.out.println(temp);
		}
		
		

	}

}