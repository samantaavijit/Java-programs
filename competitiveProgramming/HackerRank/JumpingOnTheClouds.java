package com.avijitsamanta.competitiveProgramming.HackerRank;

public class JumpingOnTheClouds {
    private static int jumpingOnCloudsV1(int[] c) {
        int j = -1, n = c.length;
        for (int i = 0; i < n; ) {
            if (i + 2 < n && c[i + 2] == 0) {
                i += 2;
                j++;
            } else {
                i++;
                j++;
            }
        }
        return j;
    }

    private static int jumpingOnCloudsV2(int[] c) {
        int j = -1, n = c.length;
        for (int i = 0; i < n; ) {
            if (i + 2 < n && c[i + 2] == 0) {
                i++;
            }
            i++;
            j++;
        }

        return j;
    }

    private static int jumpingOnCloudsV3(int[] c) {
        int j = -1, n = c.length;
        for (int i = 0; i < n; i++, j++)
            if (i + 2 < n && c[i + 2] == 0)
                i++;
        return j;
    }

    public static void main(String[] args) {
        int[] c = {0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0};
        System.out.println(jumpingOnCloudsV3(c));
    }
}
