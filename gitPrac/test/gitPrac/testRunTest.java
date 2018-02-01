package gitPrac;

import static org.junit.Assert.*;

import org.junit.Test;

public class testRunTest {

	@Test
	public void testEmpty() 
		{
			practice prac = new practice();
			assertEquals(0, prac.Add(""));
			assertEquals(0, prac.Add(null));
		}
	@Test
	public void testOne() 
		{
			practice prac = new practice();
			assertEquals(1, prac.Add("1"));
			assertEquals(2, prac.Add("2"));
			assertEquals(3, prac.Add("3"));
			assertEquals(-1, prac.Add("-1"));
			assertEquals(-10, prac.Add("-10"));
		}
	@Test
	public void testTwo() 
		{
			practice prac = new practice();
			assertEquals(2, prac.Add("1,1"));
			assertEquals(3, prac.Add("1,2"));
			assertEquals(4, prac.Add("2,2"));
			assertEquals(-2, prac.Add("-1,-1"));
			assertEquals(-5, prac.Add("-10,5"));

		}
	@Test
	public void testMore() 
		{
			practice prac = new practice();
			assertEquals(10, prac.Add("1,2,3,4"));
			assertEquals(14, prac.Add("2,3,4,5"));
			assertEquals(23, prac.Add("2,6,7,8"));
			assertEquals(1, prac.Add("-2,0,3"));
			assertEquals(-10, prac.Add("-1,-2,-3,-4"));
		}
		
	

}
