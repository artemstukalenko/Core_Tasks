package p1;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack {

    private static List<Class> blacklist = new ArrayList<>();
    private Object[] stack;
    private int top;

    public MyStack(int capacity) {
        stack = new Object[capacity];
    }

    public void push(Object object) {

        if (stackBlacklistContainsClass(object.getClass())) {
            throw new IllegalArgumentException("Objects of this type are not supported!");
        }

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

    public static void addClassToBlacklist(Class classToBlock) {
        blacklist.add(classToBlock);
    }

    public static void removeClassFromBlacklist(Class classToUnblock) {
        blacklist.remove(classToUnblock);
    }

    public static boolean stackBlacklistContainsClass(Class classToCheck) {
        return blacklist.contains(classToCheck);
    }
}
