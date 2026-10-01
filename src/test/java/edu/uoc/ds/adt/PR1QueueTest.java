package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.traversal.Iterator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class PR1QueueTest {
    PR1Queue pr1q;

    private void fillQueue() {
        for (int c = 0; c < 15; c++) {
            pr1q.add((int) (Math.pow(c,2) + (3*c) + 2));
        }
    }
    @Before
    public void setUp() {
        this.pr1q = new PR1Queue();

        assertNotNull(this.pr1q.getQueue());
        fillQueue();
    }

    @After
    public void release() {
        this.pr1q = null;
    }


    @org.junit.Test
    public void queueTest() {
        assertEquals(PR1Queue.CAPACITY, this.pr1q.getQueue().size());

        Assert.assertEquals(2, pr1q.poll());
        Assert.assertEquals(6, pr1q.poll());
        Assert.assertEquals(12, pr1q.poll());
        Assert.assertEquals(20, pr1q.poll());
        Assert.assertEquals(30, pr1q.poll());
        Assert.assertEquals(42, pr1q.poll());
        Assert.assertEquals(56, pr1q.poll());
        Assert.assertEquals(72, pr1q.poll());
        Assert.assertEquals(90, pr1q.poll());
        Assert.assertEquals(110, pr1q.poll());
        Assert.assertEquals(132, pr1q.poll());
        Assert.assertEquals(156, pr1q.poll());
        Assert.assertEquals(182, pr1q.poll());
        Assert.assertEquals(210, pr1q.poll());
        Assert.assertEquals(240, pr1q.poll());

        assertEquals(0, this.pr1q.getQueue().size());
    }

    @Test
    public void queueTest2() {

        Queue<Integer> queue = pr1q.getQueue();
        Iterator<Integer> it = queue.values();
        assertTrue(it.hasNext());
        assertEquals(Optional.of(2), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(6), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(12), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(20), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(30), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(42), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(56), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(72), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(90), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(110), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(132), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(156), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(182), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(210), Optional.of(it.next()));

        assertTrue(it.hasNext());
        assertEquals(Optional.of(240), Optional.of(it.next()));

    }

}
