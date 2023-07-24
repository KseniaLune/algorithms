package org.example.sedgewick;


import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class StackCourse {
    public static void main(String[] args) {


        StackOfStringsResizingArray stack = new StackOfStringsResizingArray();
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

class StackOfStringsResizingArray {//в основе лежит увеличивающийся массив
    private String[] s;
    private int index = 0;

    public void ResizingArrayStackOfStrings() {
        s = new String[1];
    }

    public void push(String item) {
        if (index == s.length) {
            resize(2 * s.length); //удваиваем массив
        }
        s[index++] = item;
    }

    private void resize(int capacity) {
        String[] copy = new String[capacity];
        for (int i = 0; i < index; i++) {
            copy[i] = s[i];
        }
        s = copy;
    }

    public String pop(){
        String item = s[--index];
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

class StackOfStringsArray { //в основе лежит массив, но размер массива необходимо задавать клиенту
    private String[] s;
    private int index = 0;

    public void CapacityStack(int capacity) {
        s = new String[capacity];
    }

    public void push(String item) {
        s[index++] = item;
    }

    public String pop() {
        String item = s[--index];
        s[index] = null;
        return item;
    }

    public boolean isEmpty() {
        return index == 0;
    }
}

class StackOfStringsLinkedList { //в основе лежит linked list
    private Node first = null;

    private class Node {
        private String item;
        private Node next;
    }

    public void push(String item) {
        Node old = first;
        first = new Node();
        first.item = item;
        first.next = old;
    }

    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }
}