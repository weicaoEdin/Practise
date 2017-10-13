import com.weicao.Stack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {

    Stack<String> stack = new Stack<String>();

    @Test
    public void addTest(){
        stack.add("1");
        assertEquals(1,stack.size());
    }

    @Test
    public void peekTest(){
        stack.add("1");
        assertEquals("1",stack.peek());
        assertEquals(1,stack.size());
    }

    @Test
    public void popTest(){
        stack.add("1");
        stack.add("2");
        assertEquals(2,stack.size());
        assertEquals("2",stack.pop());
        assertEquals(1,stack.size());

    }






}
