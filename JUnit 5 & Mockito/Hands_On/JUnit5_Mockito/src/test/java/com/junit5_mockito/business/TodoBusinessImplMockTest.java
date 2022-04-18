package com.junit5_mockito.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.given;
//import static org.hamcrest.CoreMatchers.is;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.junit5_mockito.data.api.TodoService;
//import com.junit5_mockito.data.api.TodoServiceStub;

class TodoBusinessImplMockTest {

	@Test
	@DisplayName("List with elements")
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring","Learn Spring Junit","Learn Mockito");
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	    List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	    assertEquals(2,filteredTodos.size());
	}
	
	@Test
	@DisplayName("Empty List")
	public void testRetrieveTodosRelatedToSpring_withEmptyList() {
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList();
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	    List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	    assertEquals(0,filteredTodos.size());
	}
	
	@Test
	@DisplayName("List with BDD Mockito")
	public void testRetrieveTodosRelatedToSpring_usingBDD() {
		
		//Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring","Learn Spring Junit","Learn Mockito");
		
		given(todoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	    
	    //When
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		//Then
		assertEquals(2,filteredTodos.size());
	
	    //assertThat(filteredTodos.size(), is(2));
	}
}
