package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test(priority = 1,timeOut = 2000)//in order to execute the method with out alphabetical order we use priority
	public void test () throws InterruptedException {// we use the timeout keyword when we want the method should run with given time 
		
		System.out.println("test executed");
	}
	
	@Test(priority = 2 )//in order dont run the method we use enable keyword
	public void test1 () {
		System.out.println("test1 executed");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method executed");
	}
	
	@AfterMethod
	public void aftermethod () {
		System.out.println("after method excuted");
	}
	
	@Test (invocationCount = 2,dependsOnMethods = {"test"})//to run the method multiple time we use invocation keyword
     public void test3() {
		System.out.println("run two time");
	}




}
