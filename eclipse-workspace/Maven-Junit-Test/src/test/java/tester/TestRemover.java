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
		assertEquals("BCD",rem.remove("ABCD"));
	}
	
	@Test
	void testSecondChar() 
	{
		assertEquals("BCD",rem.remove("BACD"));
	}
	
	@Test
	void testTwoChar() 
	{
		// AA if input then empty string is output
		// AABAA if input then BAA is output
		assertEquals("CD",rem.remove("AACD"));         
	}
	
	@Test
	void testNoChar() 
	{
		assertEquals("BBAA",rem.remove("BBAA"));
	}
	
	@Test
	void testSingleChar() 
	{
		assertEquals("",rem.remove("A"));
	}
	
}
