package com.junit5_mockito.business;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.junit5_mockito.data.api.TodoService;
import com.junit5_mockito.data.api.TodoServiceStub;

class TodoBusinessImplStubTest {

	@Test
	public void test() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
	    List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
	    assertEquals(2,filteredTodos.size());
	}

}
