package com.example.demo;

import com.example.demo.service.TodoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoServiceUnitTest extends DemoApplicationTests{

    private TodoService todoService= new TodoService();

    @Test
    public void debeDecirHello(){
        assertEquals("hello",todoService.sayHello());
    }

    @Test
    public void pruebaSuma(){
        assertEquals(2,todoService.suma(1,1));
    }
}