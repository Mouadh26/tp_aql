package test_tp0;

import org.example.tp0.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void push_ExpandsArrayWhenFull() {
        Stack stack = new Stack();
        for (int i = 0; i < 11; i++) stack.push(i);
        assertEquals(11, stack.size());
    }
//ici on remarque que ce test est failed ;Expected :20
//Actual   :11
    @Test
    void pop_ThrowsExceptionWhenEmpty() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void peek_ReturnsTopElementWithoutRemoval() {
        Stack stack = new Stack();
        stack.push(5);
        assertEquals(5, stack.peek());
        assertEquals(1, stack.size());
    }
}