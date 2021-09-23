package p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;

public class MyStack {

    private Object[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = new Object[capacity];
    }

    public void push(Object object) {
        if (top == stack.length) {
            Object[] newArray = new Object[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = object;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Object object = stack[--top];
        stack[top] = null;

        return object;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
