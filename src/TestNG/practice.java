package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class practice {

	@Test
	@Parameters({"a","b"})
	public void test(int a, int b) {
		System.out.println(a*b);
	}
	@Test
	@Parameters({"a","b"})
	public void demo(int a,int b) {
		System.out.println("a+b");
	}
	@Test
	public void sample () {
		System.out.println("sample executed");
	}
}
