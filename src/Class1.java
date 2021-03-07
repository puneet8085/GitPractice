import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Execute before @BeforeTestnow");
	}
	
	
	@BeforeTest
	public void beforTest()
	{
		System.out.println("Execute before @BeforeMetod now");
	
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Execute After @After Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Execute before @Test");
	}
	
	@Test
	public void testMethod()
	{
		System.out.println("Test method ");
	}
	

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Execute after @Test");
	}
}
