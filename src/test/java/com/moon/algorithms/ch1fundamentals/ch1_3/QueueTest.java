package com.moon.algorithms.ch1fundamentals.ch1_3;

import com.moon.algorithms.std.In;
import org.junit.Test;

import java.util.Iterator;

/**
 * @author Chanmoey
 * @date 2023/9/20
 */
public class QueueTest {

    @Test
    public void queueTest() {
        Queue<String> queue = new Queue<>();
        In in = new In("tobe.txt");
        String line = in.readLine();
        String[] op = line.split(" ");
        for (String o : op) {
            if ("-".equals(o)) {
                System.out.print(queue.dequeue() + " ");
            } else {
                queue.enqueue(o);
            }
        }
    }

    @Test
    public void queuePage152Test() {
        Queue<String> queue = new Queue<>();
        In in = new In("tobe.txt");
        String line = in.readLine();
        String[] op = line.split(" ");
        for (String o : op) {
            if ("-".equals(o)) {
                queue.dequeue();
            } else {
                queue.enqueue(o);
            }

            System.out.println(queue);
        }
    }

    @Test
    public void FixedCapacityQueueTest() {
        FixedCapacityQueue<String> queue = new FixedCapacityQueue<>(1);
        In in = new In("tobe.txt");
        String line = in.readLine();
        String[] op = line.split(" ");
        for (String o : op) {
            if ("-".equals(o)) {
                queue.dequeue();
            } else {
                queue.enqueue(o);
            }

            System.out.println(queue);
        }
    }

    @Test
    public void testIterator() {
        FixedCapacityQueue<String> queue = new FixedCapacityQueue<>(1);
        In in = new In("tobe.txt");
        String line = in.readLine();
        String[] op = line.split(" ");
        for (String o : op) {
            queue.enqueue(o);
        }
        for (String string : queue) {
            System.out.print(string + " ");
        }
    }
}
