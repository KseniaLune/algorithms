package org.example.sedgewick;


import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class StackCourse {
    public static void main(String[] args) {


        StackResizingArray<String> stack = new StackResizingArray<>();
        stack.ResizingArrayStackOfStrings();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (s.equals("-")) {
                System.out.println(stack.pop());
            } else {
                stack.push(s);
            }
        }
    }
}

class StackResizingArray<T> {//в основе лежит увеличивающийся массив
    private T[] s;
    private int index = 0;

    public void ResizingArrayStackOfStrings() {
        s = (T[]) new Object[1];
    }

    public void push(T item) {
        if (index == s.length) {
            resize(2 * s.length); //удваиваем массив
        }
        s[index++] = item;
    }

    private void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];
        for (int i = 0; i < index; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public T pop(){
        T item = s[--index];
        s[index] = null;
        if (index>0&& index==s.length/4){
            resize(s.length/2); //уменьшаем массив в два раза
        }
        return item;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}

class StackArray<T> { //в основе лежит массив, но размер массива необходимо задавать клиенту
    private T[] s;
    private int index = 0;

    public void CapacityStack(int capacity) {
        s = (T[]) new Object[1];
    }

    public void push(T item) {
        s[index++] = item;
    }

    public T pop() {
        T item = s[--index];
        s[index] = null;
        return item;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}

class StackLinkedList<T> { //в основе лежит linked list
    private Node first = null;

    private class Node {
        private T item;
        private Node next;
    }

    public void push(T item) {
        Node old = first;
        first = new Node();
        first.item = item;
        first.next = old;
    }

    public T pop() {
        T item = first.item;
        first = first.next;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }
}