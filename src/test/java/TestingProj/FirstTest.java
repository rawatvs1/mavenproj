package TestingProj;

import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void FirstGood()
	{
		System.out.println("FirstGood");
	}
	
	@Test
	public void FirstBad()
	{
		System.out.println("FirstBad");
		System.out.println("additional line");

	}
	
}
