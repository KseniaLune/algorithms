package org.example.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DeepTree {
    public static void main(String[] args) {
        Tree root = new Tree(20,
            new Tree(7,
                new Tree(4, null, new Tree(6)), new Tree(9)),
            new Tree(35,
                new Tree(31, new Tree(28), null),
                new Tree(40, new Tree(38), new Tree(52))));

//        System.out.println("Tree sum =" + sum(root));
//        System.out.println("Tree sum =" + sumIterative(root));
        System.out.println("Tree sum =" + sumIterativeWide(root));
    }

    public static int sum(Tree root) { //рекурсивный обход в глубину, всегда будет медленнее обычного цикла
        int summ = root.value;
        if (root.left != null) {
            summ += sum(root.left);
        }
        if (root.right != null) {
            summ += sum(root.right);
        }
        return summ;
    }

    public static int sumIterative(Tree root) {//обход в глубину через циклы
        Stack<Tree> stack = new Stack<>();
        stack.push(root);

        int summ = 0;

        while (!stack.isEmpty()) {
            Tree node = stack.pop();
            System.out.println(node.value);//показывает, в каком порядке мы обходим узлы
            summ += node.value;

            if (node.left != null) {
                stack.push(node.left);
            }

            if (node.right != null) {
                stack.push(node.right);
            }

        }
        return summ;
    }
    public static int sumIterativeWide(Tree root) {//обход в ширину через циклы
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);

        int summ = 0;

        while (!queue.isEmpty()) {
            Tree node = queue.remove();
            System.out.println(node.value);
            summ += node.value;

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }

        }
        return summ;
    }
}

class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree() {
    }

    public Tree(int value) {
        this.value = value;
    }

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}
