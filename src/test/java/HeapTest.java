import com.weicao.Heap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeapTest {

    Heap<Integer> heap = new Heap<>();

    @Test
    public void addTest(){
        assertEquals(0,heap.size());
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(1);
        assertEquals(4,heap.size());
    }

    @Test
    public void peakTest() throws Exception{
        assertEquals(0,heap.size());
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(1);
        assertEquals(4,heap.size());
        assertEquals(   new Integer(1), heap.peak());
    }

    @Test
    public void removeTest() throws Exception{
        assertEquals(0,heap.size());
        heap.add(2);
        heap.add(2);
        heap.add(4);
        heap.add(1);
        heap.add(5);
        heap.add(10);
        heap.add(8);
        heap.add(9);
        heap.add(24);
        heap.add(9);
        heap.add(11);
        heap.add(25);
        heap.add(7);
        heap.add(9);
        assertEquals(14,heap.size());
        assertEquals(   new Integer(1), heap.remove());
        assertEquals(   new Integer(2),heap.remove());
        assertEquals(   new Integer(2),heap.remove());
        assertEquals(   11,heap.size());
    }




}
