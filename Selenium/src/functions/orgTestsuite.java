package functions;

public class orgTestsuite {

	public static void main(String[] args) 
	{
		//login TC
		
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
		
		
		//Empreg Tc
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		//login
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		//empreg
		res=om.org_Empreg("sriyan", "M");
		System.out.println(res);
		
		//logout
		
		res=om.org_Logout();
		System.out.println(res);
		
		//close
		
		om.org_Close();
		
		//user reg TC
		
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		//login
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
		
		//user reg
		res=om.org_Userreg("sriyan M", "sriyan1234567", "sriyan1234567", "sriyan1234567");
		System.out.println(res);
		//logout
		
		res=om.org_Logout();
		System.out.println(res);
		
		//close
		
		om.org_Close();
		
		
		//user login Tc
		res=om.org_Launch("http://opensource.demo.orangehrm.com");
		System.out.println(res);
		
		//login
		res=om.org_Login("sriyan1234567", "sriyan1234567");
		System.out.println(res);
		
		//logout
		
		res=om.org_Logout();
		System.out.println(res);
		
		//close
		
		om.org_Close();

	}

}
