package org.example.sedgewick;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicConnectivity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        WeightedQuickUnion quick = new WeightedQuickUnion(N);
        while (in.hasNext()) {
            int p = in.nextInt();
            int q = in.nextInt();
            if (!quick.connected(p, q)) {
                quick.union(p, q);
                System.out.println(p + " " + q);
                System.out.println(quick.id());
            }
        }
    }

}

class PathCompressionQuickUnionUf {
    private int[] id;

    public PathCompressionQuickUnionUf(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;

        }
    }

    public int[] id() { //show array
        return id;
    }

    private int root(int i) { //find the parent (move down to up)
        while (i != id[i]) {
            id[i] = id[id[i]];//every other node in path point to its grandparent
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}


class WeightedQuickUnion {
    private int[] id;
    private int[] sz; //count number of obj in the tree

    public WeightedQuickUnion(int N) {
        this.id = new int[N];
        this.sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public String id() { //show array
        String x = "id[] = "+Arrays.toString(id)+", sz[]= "+Arrays.toString(sz);
        return x;
    }

    private int root(int i) { //find the parent (move down to up)
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (i == j) return;
        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}

class QuickUnionUf {
    private int[] id;

    public QuickUnionUf(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int[] id() { //show array
        return id;
    }

    private int root(int i) { //find the parent (move down to up)
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}

class QuickFindUf {

    private int[] id;

    public QuickFindUf(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public int[] id() { //show array
        return id;
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q]; //check: p&q are in the same component?
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) { //change all entries with id[p] to id[q]
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}

