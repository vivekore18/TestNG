package TestNG;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class methods {

	//different Annotations
	@BeforeTest
	public void beforetest(){
		System.out.println("+++++++++++++++before test ++++++++++++++ ");
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("++++++++++++++ After test +++++++++++++++ ");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("---------before method-----");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("---------after method-----");
	}
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("********before suite********");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("********after suite********");
	}
	
	@BeforeClass
	public void beforeclass(){
		System.out.println("==========before class=========");
	}
	 
	@AfterClass
	public void afterclass(){
		System.out.println("==========after class==========");
		}
	
	@Test
	public void logintest(){
			
		System.out.println("login test");
		Reporter.log("output login");
		}

	//priority
	@Test(priority=1 ,dependsOnMethods={"logintest"})
	public void passwordchange(){
		
		System.out.println("password change");
		Reporter.log("output password");
	}

	@Test(priority=2 ,dependsOnMethods={"logintest"})
	public void logouttest(){
		
		System.out.println("logout test");
		Reporter.log("output logout");
	}
	
	
	//disabiling testcases 
	@Test(enabled=false)
	public void disabling(){
		
		System.out.println("disabiling testcases");
		
	}
	
	//enabling testcases
	@Test(enabled=true)
	public void enabling(){
		
		System.out.println("enabling testcases");
		Reporter.log("output enabled");
	}
}
