package tester;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestRemover {
	
	/*       “ABCD” => “BCD” --done
             “AACD” => “CD”  --done
             “BACD” => “BCD” --done
             “BBAA” => “BBAA” --done      
             “AABAA” => “BAA” --done
             "AA"    =>  ""   --done
             "A"     =>  ""   --done
   */
	
	Remover rem;
	
	@BeforeEach
	void setUp()
	{
		rem=new Remover();
	}

	@Test
	void testFirstChar()
	{
		setUp();
		String act=rem.remove("ABCD");
		assertEquals("BCD",act);
	}
	
	@Test
	void testSecondChar() {
		setUp();
		String act=rem.remove("BACD");
		assertEquals("BCD",act);
	}
	
	@Test
	void testTwoChar() {
		setUp();
		String act=rem.remove("AACD");  // AABAA if input then BAA is output
		assertEquals("CD",act);         // AA if input then empty string is output
	}
	
	@Test
	void testNoChar() {
		setUp();
		String act=rem.remove("BBAA");
		assertEquals("BBAA",act);
	}
	
	@Test
	void testSingleChar() {
		setUp();
		String act=rem.remove("A");
		assertEquals("",act);
	}
	
}
