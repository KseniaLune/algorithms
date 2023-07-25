package org.example.sedgewick;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class QueueCourse {
    public static void main(String[] args) {
//        QueueOfStringsLinkedList queue = new QueueOfStringsLinkedList();
        QueueResizingArray queue = new QueueResizingArray();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.equals("-")) {
                System.out.println(queue.dequeue());
            } else {
                queue.enqueue(s);
            }
        }
    }
}

class QueueResizingArray<T> {
    private T[] s = (T[]) new Object[1];
    private int head = 0;
    private int tail = 0;

    public void enqueue(T item) {
        if(tail==s.length){
            resize(2*s.length);
        }
        s[tail] = item;
        tail++;
    }
    private void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0, j = head; i <= tail-head&&j<tail; i++, j++) {
            copy[i] = s[j];
        }
        tail = tail-head;
        head = 0;
        s = copy;
    }

    public T dequeue() {

        T item = s[head];
        s[head] = null;
        head++;

        if(tail>0&&tail-head==s.length/4){
            resize(s.length/2);
            System.out.println("уменьшаем массив");
            System.out.println(Arrays.toString(s));
        }
        return item;
    }

    public boolean isEmpty() {
        return head==0;
    }
}

class QueueLinkedList<T> {
    private Node first, last;

    private class Node {
        private T item;
        private Node next;
    }

    public void enqueue(T item) {
        Node old = this.last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            old.next = last;
        }
    }

    public T dequeue() {
        T item = first.item;
        this.first = first.next;
        if (isEmpty()) {
            last = null;
        }

        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
