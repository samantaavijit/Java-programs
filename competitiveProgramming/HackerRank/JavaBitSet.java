package com.avijitsamanta.competitiveProgramming.HackerRank;

import java.util.*;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet a = new BitSet(n);
        BitSet b = new BitSet(n);
        String op;
        int set, pos;
        for (int i = 0; i < m; i++) {
            op = sc.next();
            set = sc.nextInt();
            pos = sc.nextInt();

            switch (op) {
                case "AND":
                    if (set == 1) {
                        a.and(b);
                    } else
                        b.and(a);
                    break;
                case "SET":
                    if (set == 1) {
                        a.set(pos, true);
                    } else
                        b.set(pos, true);
                    break;
                case "OR":
                    if (set == 1) {
                        a.or(b);
                    } else b.or(a);
                    break;
                case "XOR":
                    if (set == 1) {
                        a.xor(b);
                    } else b.xor(a);
                    break;
                case "FLIP":
                    if (set == 1)
                        a.flip(pos);
                    else b.flip(pos);
                    break;
            }
            int c = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.get(j)) c++;
            }
            System.out.print(c);
            c = 0;
            for (int j = 0; j < b.length(); j++)
                if (b.get(j)) c++;
            System.out.println(" " + c);
        }
    }
}
