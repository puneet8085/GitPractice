
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Test method ");
	}
	@Test
	public void testMethod()
	{
		System.out.println("Test method ");
	}
	
}
