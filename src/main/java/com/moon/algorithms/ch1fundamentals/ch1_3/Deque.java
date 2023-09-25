package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * @author Chanmoey
 * @date 2023/9/25
 */
public interface Deque<E> {

    boolean isEmpty();

    int size();

    void pushLeft(E e);

    void pushRight(E e);

    E popLeft();

    E popRight();
}
