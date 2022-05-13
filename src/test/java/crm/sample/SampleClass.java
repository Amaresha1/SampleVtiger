package crm.sample;

import org.testng.annotations.Test;

public class SampleClass 
{
	@Test
	public void contactTest()
	{
		System.out.println("execute created contact");
		System.out.println("~~~~~~browser~~~~~"+System.getProperty("browser"));
	}

}
