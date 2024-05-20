package stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStackTest {

    @Test
    void push() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(306);
        assertEquals(306, stack.peek());
    }

    @Test
    void pop_empty() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void pop_normal() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(306);
        assertEquals(306, stack.pop());
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void pop_another() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertThrows(EmptyStackException.class, () -> stack.pop());
    }

    @Test
    void peek_empty() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }

    @Test
    void peek_normal() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(306);
        assertEquals(306, stack.peek());
        assertEquals(306, stack.peek());
    }

    @Test
    void peek_another() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek());
        assertEquals(2, stack.peek());
        assertEquals(2, stack.peek());
    }

    @Test
    void clear() {
        SimpleStack<Integer> stack = new SimpleStack<>();
        stack.push(1);
        stack.clear();
        assertThrows(EmptyStackException.class, () -> stack.peek());
    }
}