package functions;

public class userlogintest {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		//launch
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		//login
		res=om.org_Login("vineesham123", "vineesham123");
		System.out.println(res);
		
		//logout
		
		res=om.org_Logout();
		System.out.println(res);
		
		//close
		
		om.org_Close();
		

	}

}
