package org.example.sedgewick;

import java.util.Arrays;
import java.util.Scanner;

public class DynamicConnectivity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        QuickFindUf quick = new QuickFindUf(N);
        while (in.hasNext()) {
            int p = in.nextInt();
            int q = in.nextInt();
            if (!quick.connected(p, q)) {
                quick.union(p, q);
                System.out.println(p + " " + q);
                System.out.println(Arrays.toString(quick.id()));
            }
        }
    }

}

class QuickUnionUf{
    private int [] id;

    public QuickUnionUf(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int[] id(){ //show array
        return id;
    }

    private int root(int i){ //find the parent (move down to up)
        while (i!=id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return root(p)==root(q);
    }
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}

class QuickFindUf {//difficulty On^2 - too slow

    private int[] id;

    public QuickFindUf(int N) {
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }
    public int[] id(){ //show array
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

