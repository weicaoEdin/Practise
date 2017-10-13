import com.weicao.Queue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {


    Queue<String> queue = new Queue<String>();

    @Test
    public void enQueueTest(){

        assertEquals(0,queue.size());
        queue.enqueue("1");
        queue.enqueue("2");
        assertEquals(2,queue.size());


    }
    @Test
    public void deQueueTest(){
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        assertEquals(3,queue.size());
        assertEquals("1",queue.Dequeue());
        assertEquals("2",queue.Dequeue());
        assertEquals("3",queue.Dequeue());
    }



}
