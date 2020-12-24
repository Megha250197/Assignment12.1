package Test;



import org.testng.annotations.Test;

import Base.BaseApi;
import utils.SampleApi;


public class SampleTest{
	
	@Test
	public void test1()
	{
		BaseApi.getMethod("https://reqres.in/api/users?page=2");//get

	}
	@Test
	public void test2()
	{
		BaseApi.getMethod1("http://moolya.com", "nitesh");//using queryparam
	    BaseApi.getMethod2("http://moolya.com", "megha");//using path param
	}
	@Test
	public void test3()
	{
		SampleApi.api1("http://moolya.com/demo/name=nitesh", "{\"name\":\"nitesh\",\"password\":\"abcd\"}");//post
		SampleApi.api2();
		SampleApi.api3();
	}
	
	
}
