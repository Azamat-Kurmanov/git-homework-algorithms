package ru.gb.hw2.queue;

import java.util.Arrays;

public class QueueImpl<E> implements Queue<E>{
    private final E[] data;
    private int size;
    private int tail;
    private int head;

    public QueueImpl(int maxSize) {
        this.data = (E[])new Object[maxSize];
        tail = -1;
        head = 0;
    }

    @Override
    public boolean insert(E value) {
        if (isFull()){
            return false;
        }
        if (tail==data.length-1) {
            tail = -1;
        }
        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()){
            return null;
        }
        E value = data[head++];
        if (head==data.length) {
            head = 0;
        }
        size--;
        return value;
    }

    @Override
    public E peekFront() {
        if (isEmpty()){
            return null;
        }
        E value = data[head];
        data[head++] = null;
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
//        StringBuilder sb = new StringBuilder("[");
//        for (int i = head; i <= tail; i++) {
//            sb.append(data[i]);
//            if (i != tail){
//                sb.append(", ");
//            }
//        }
//        return sb.append("]").toString();
        return Arrays.toString(data);
    }
}
