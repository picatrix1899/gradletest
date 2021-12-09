package com.test;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class ClassTest
{

	@Test
	void test()
	{
		ITest t = mock(ITest.class);
	
		doNothing().when(t).bla();
		
		t.bla();
		
		verify(t).bla();
		
		verifyNoMoreInteractions(t);
	}

	public interface ITest
	{
		void bla();
	}
	
}
