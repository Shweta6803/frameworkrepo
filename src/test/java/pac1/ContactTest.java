package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontacttest()
	{
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println("create contact test");
		System.out.println(url);
	}
	
	@Test
	public void modifycontacttest()
	{
		System.out.println("modify contact test");
	}


}
