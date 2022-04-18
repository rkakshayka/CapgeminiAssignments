package co.junit5_mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.given;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class ListMock {
	
	@SuppressWarnings("rawtypes")
	@Test
	public void letsMockListSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
		assertEquals(2,listMock.size());
	}
	
	@Test
	public void letsMockListSize_ReturnMultipleValue() {
		@SuppressWarnings("rawtypes")
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3).thenReturn(4);
		
		assertEquals(2,listMock.size());
		assertEquals(3,listMock.size());
		assertEquals(4,listMock.size());
	}
	
	@Test
	public void letsMockListGet() {
		//Argument Matcher
		
		@SuppressWarnings("rawtypes")
		List listMock = mock(List.class);
	//	when(listMock.get(0)).thenReturn("Mock List");
		when(listMock.get(anyInt())).thenReturn("Mock List");
		
		assertEquals("Mock List",listMock.get(0));
		assertEquals("Mock List",listMock.get(2));
	}
	
	@Disabled
	//@Test(expected=RuntimeException.class)
	public void letsMockList_throwAnException() {
		//Argument Matcher
		
		@SuppressWarnings("rawtypes")
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
		
		listMock.get(0);
	}
	
	@DisplayName("BDD")
	@Test
	public void letsMockListGet_usingBDD() {
		//Given
		@SuppressWarnings("unchecked")
		List<String> listMock = mock(List.class);
		given(listMock.get(anyInt())).willReturn("Mock List");
		
		//When
		String firstElement = listMock.get(0);
		
		//Then
		//assertThat(firstElement,is("BDD mock List"));
		assertEquals("Mock List",firstElement);
	}

}
