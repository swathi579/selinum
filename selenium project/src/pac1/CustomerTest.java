package pac1;

import org.testng.annotations.Test;

public class CustomerTest {
	@Test
	public void createCustomer()
	{
		System.out.println("execute create customer test");
	}
	@Test
	private void modifyCustomer()
	{
		System.out.println("execute modify customer test");
	}
	@Test
	public static void deleteCustomer()
	{
		System.out.println("execute delete customer test");
	}
}
