package com.epam3.Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAFromFirst2CharsTest {
   /*
    *
	 */
	RemoveAFromFirst2Chars r;
	@BeforeEach
	void initializeTest()
	{
		r=new RemoveAFromFirst2Chars();
	}
	@Test
	void testEmptyString() {
		
		assertEquals("",r.remove(""));
	}
	@Test
	void test1Chars() {
		assertEquals("B",r.remove("B"));
	}
	@Test
	void test2Chars() {
		assertEquals("B",r.remove("BA"));
	}
	@Test
	void test4Chars() {
		assertEquals("BCD",r.remove("ABCD"));
	}
	@Test
	void testNChars() {
		assertEquals("BCDEF",r.remove("AABCDEF"));
	}

}
