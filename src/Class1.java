import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeTest
	public void beforTest()
	{
		System.out.println("Execute before @BeforeMetod now");
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
