package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/10/7
 */
public class TwoStackWithDeque<E> {

    private int leftSize;
    private int rightSize;
    private final Deque<E> deque;

    public TwoStackWithDeque() {
        this.leftSize = 0;
        this.rightSize = 0;
        this.deque = new DequeByDoublyLinked<>();
    }

    public int leftSize() {
        return leftSize;
    }

    public int rightSize() {
        return rightSize;
    }

    public boolean leftIsEmpty() {
        return leftSize == 0;
    }

    public boolean rightIsEmpty() {
        return rightSize == 0;
    }

    public void pushLeft(E e) {
        deque.pushLeft(e);
        this.leftSize++;
    }

    public void pushRight(E e) {
        deque.pushRight(e);
        this.rightSize++;
    }

    public  E popLeft() {
        if (leftIsEmpty()) {
            throw new IllegalArgumentException("Left stack is empty!");
        }
        this.leftSize --;
        return deque.popLeft();
    }

    public  E popRight() {
        if (rightIsEmpty()) {
            throw new IllegalArgumentException("Right stack is empty!");
        }
        this.rightSize --;
        return deque.popRight();
    }

    @Override
    public String toString() {
        return this.deque.toString();
    }
}
