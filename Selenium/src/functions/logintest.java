package functions;

public class logintest {

	public static void main(String[] args) 
	{
		orgMaster om=new orgMaster();
		//launch
		String res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		//login
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		//logout
		
		res=om.org_Logout();
		System.out.println(res);
		
		//close
		
		om.org_Close();

	}

}
