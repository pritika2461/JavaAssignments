  import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MathUtilTest 
{
	MathUtil m = new MathUtil();
	@Test
	void test()
	{
		
		// int expected =2;
		// int actual = m.add();
		assertEquals(4, m.add(2,2), "This should return an addition of two numbers");
		
	}
	
	@Test
	@Disabled     // it is disable this method  
	void test2()
	{
		assertEquals(2,m.sub(7, 5));
	}
	@AfterAll
	@Test 
	void test3()
	{
	      assertEquals(10,m.mul(2, 5));	
	      System.out.println("After all");
	}

	@Test
	@BeforeAll
	static void test4()
	{
		System.out.println("its befour all");
	}
	
	@Test
	@BeforeEach
	static void test5()
	{
		System.out.println("its befour each");
	}
	
	
}
