
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	
	
	
	@Test
	public void testMethod()
	{
		System.out.println("Test method ");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Test method ");
	}
	
}
