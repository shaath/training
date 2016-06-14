
public class twodimarray {

	public static void main(String[] args) 
	{
		Object[][] x=new Object[2][3];
		
		//length of the rows
		System.out.println(x.length);
		
		//columns length
		
		System.out.println(x[0].length);
		
		//write the data into the cells
		
		x[0][0]=20000;
		x[0][1]="Qedge";
		x[0][2]='S';
		
		x[1][0]=true;
//		x[1][1]=20000.888;
		x[1][2]="Sandhya";
		
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
				
				
			}
			
		}

	}

}
