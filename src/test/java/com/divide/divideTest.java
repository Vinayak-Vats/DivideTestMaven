package com.divide;

import static org.junit.Assert.*;

import org.junit.Test;
import com.sapient.lib.Arithmetic;
public class divideTest {

	@Test
	public void testDivide()
    	{
		int expectedResult = 2,actualResult;
        	divide arithmetic = new divide();
        	actualResult=arithmetic.divide(10,5);
        	assertEquals(expectedResult,actualResult);
    	}

}
