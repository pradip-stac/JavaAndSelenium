package program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@Test
	public void test1() {
		System.out.println("test1 executed");
	}
	@Test
	public void test2() {
		System.out.println("test2 executed");
	}
	@BeforeClass
	public void beforeclass() {//it run one time when the execution start
		System.out.println("before class");
	}
	@AfterClass
	public void afterclass() {//it run at the end of program but before the after test
		System.out.println("afterclass");
	}
	@BeforeMethod
	public void beforemethod() {//it can be run before any test or method. it can be run multiple time
		System.out.println("before method");
	}

	@AfterMethod
	public void aftermetho() {//after method run after every test
		System.out.println("after method");
	}
	@BeforeTest 
	public void beforetest() {//it run before the beforeclass annotation 
		System.out.println("before test");
	}
	@AfterTest
	public void aftertest() {//it run after the afterclass annotation or at the end of execution
		System.out.println("after test");
	}
}
