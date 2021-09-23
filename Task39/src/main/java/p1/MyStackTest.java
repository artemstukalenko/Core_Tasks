package p1;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        String string1 = new String("abc");
        Integer integer1 = new Integer(3);

        stack.push(string1);
        stack.push(integer1);

        stack.printStack();
        System.out.println("Peek: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.printStack();

        MyStack.addClassToBlacklist(StringBuffer.class);
        StringBuffer sb = new StringBuffer(string1);

        try {
            stack.push(sb);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
