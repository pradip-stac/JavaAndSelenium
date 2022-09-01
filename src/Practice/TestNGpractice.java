package Practice;

import org.testng.annotations.Test;

public class TestNGpractice {

	@Test (timeOut = 2000)
	public void sample() throws InterruptedException {
		
		System.out.println("sample Executed");
	}
	@Test(invocationCount = 2)
	public void demo () {
		System.out.println("demo executed");
	}
	@Test(enabled = false)
	public void test(){
		System.out.println("test executed");
	}
	@Test(dependsOnMethods = {"sample"}) 
	public void pd () {
		System.out.println("pd executed");
	}
	
}
