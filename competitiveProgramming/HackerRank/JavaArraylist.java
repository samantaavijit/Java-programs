package com.avijitsamanta.competitiveProgramming.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
/*
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
 */

/*
74
52
37
ERROR!
ERROR!
 */
public class JavaArraylist {
    public static void main(String[] args) {
        List<List<Integer>> mainList = new ArrayList<>();
        System.out.print("Enter the limit ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter array size ");
            int d = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            System.out.println("Enter value");
            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt());
            }
            mainList.add(list);
        }
        HashMap<String, Integer> map = new HashMap<>();
        
        System.out.print("Enter query ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                List<Integer> list = mainList.get(x - 1);
                System.out.println(list.get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }

    }
}
