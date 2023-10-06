package com.moon.algorithms.ch1fundamentals.ch1_3;

/**
 * Text Editor Buffer
 *
 * @author Chanmoey
 * @date 2023/9/28
 */
public class Buffer {

    private int size;

    /**
     * save the input char
     */
    private final Stack<Character> input;

    /**
     * if user call left, move some char into stack back
     */
    private final Stack<Character> back;

    public Buffer() {
        this.size = 0;
        this.input = new Stack<>();
        this.back = new Stack<>();
    }

    public void insert(char c) {
        this.input.push(c);
        this.size++;
    }

    /**
     * delete and return the character at the  cursor
     */
    public char delete() {
        if (this.input.isEmpty()) {
            throw new IllegalArgumentException("Nothing can be delete!");
        }
        this.size --;
        return this.input.pop();
    }

    public void left(int k) {
        for (int i = 0; i < k; i++) {
            if (this.input.isEmpty()) {
                break;
            }
            this.back.push(this.input.pop());
        }
    }

    public void right(int k) {
        for (int i = 0; i < k; i++) {
            if (this.back.isEmpty()) {
                break;
            }
            this.input.push(this.back.pop());
        }
    }

    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "";
        }
        Stack<Character> iCopy = new Stack<>(input);
        Stack<Character> bCopy = new Stack<>(back);

        Stack<Character> temp = new Stack<>();
        while (!bCopy.isEmpty()) {
            temp.push(bCopy.pop());
        }
        temp.push('|');
        while (!iCopy.isEmpty()) {
            temp.push(iCopy.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!temp.isEmpty()) {
            sb.append(temp.pop());
        }
        return sb.toString();
    }
}
