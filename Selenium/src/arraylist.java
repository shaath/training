import java.util.ArrayList;


public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList<String> s=new ArrayList<String>();
		
		//writing the data into arraylist
		
		s.add("Selenium");
		s.add("Qtp");
		s.add(2, "Sandhya");
		s.add("Qedge");
		
		
		//finding the length of the array
		
		System.out.println(s.size());
		
		//read the data from arraylist
		
		for (int i = 0; i < s.size(); i++)
		{
			System.out.println(s.get(i));
			
			
		}
		
		
		

	}

}
