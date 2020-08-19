package com.avijitsamanta;

import java.util.*;

public class Main {

    static int missingNumber(int[] arr, int size) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= 0 && arr[i] + 1 != arr[i + 1])
                return arr[i] + 1;
        }
        return arr[size - 1] + 1;

    }

    private static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int check(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u')
                count++;
        }
        return count;
    }

    private static int getResult(int a, int b) {
        int x = a + b;
        int y = a * b;
        int z = a - b;
        return x + y + z;
    }

    public static String findSubstring(String s, int k) {
        // Write your code here
        String str = "";
        int max = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            final String substring = s.substring(i, i + k);
            int c = check(substring);

            if (c > max) {
                max = c;
                str = substring;
            }

        }
        return str;
    }

    public static int[] stringAnagram(String[] dictionary, String[] query) {
        int[] result = new int[query.length];

        for (int i = 0; i < query.length; i++) {
            char[] qr = query[i].toCharArray();
            Arrays.sort(qr);
            String qrKey = String.valueOf(qr);
            result[i] = 0;
            for (String dict : dictionary) {
                if (qrKey.length() != dict.length())
                    continue;
                char[] dr = dict.toCharArray();
                Arrays.sort(dr);
                String drKey = String.valueOf(dr);
                if (qrKey.equals(drKey)) {
                    result[i]++;
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {


//        int[] arr = {28, 7, -36, 21, -21, -50, 9, -32};
//
//        System.out.println(missingNumber(arr, arr.length));
//        int n = 1;
//        for (int i = 0; i < 10; ) {
//            if (isPrime(n)) {
//                System.out.print(n + " ");
//                i++;
//            }
//            n++;
//        }
//
//
//        String str="qwdftri";
//        System.out.println(findSubstring(str,2));
//
//        List<String> dict = new ArrayList<>();
//        dict.add("hack");
//        dict.add("a");
//        dict.add("rank");
//        dict.add("khac");
//        dict.add("ackh");
//        dict.add("kran");
//        dict.add("rankhacker");
//        dict.add("a");
//        dict.add("ab");
//        dict.add("ba");
//        dict.add("stair");
//
//        List<String> qr = new ArrayList<>();
//        qr.add("a");
//        qr.add("nark");
//        qr.add("bs");
//        qr.add("hack");
//        qr.add("stair");
//
//        List<Integer> res = stringAnagram(dict, qr);
//        for (Integer i:res)
//            System.out.println(i);
//
//
//        int[][] bArr = {{1, 1, 1, 0, 0, 0},
//                {0, 1, 0, 0, 0, 0},
//                {1, 1, 1, 0, 0, 0},
//                {0, 0, 2, 4, 4, 0},
//                {0, 0, 0, 2, 0, 0},
//                {0, 0, 1, 2, 4, 0}};
//        System.out.println(calculate(bArr));


        int a = 10, b = 5;
        System.out.println(getResult(a, b));

        int c = 50, d = 60;
        System.out.println(getResult(c, d));
        System.out.println(getResult(100, -50));

    }

    private static void display(int[][] arr) {
        int c = 1;
        for (int i = 0; i <= arr.length - 3; i++) {
            c = 1;
            for (int j = 0; j <= arr.length - 3; j++) {
                System.out.println(arr[i][j] + " " + arr[i][j + 1] + " " + arr[i][j + 2]);
                System.out.println("  " + arr[i + 1][c++]);
                System.out.println(arr[i + 2][j] + " " + arr[i + 2][j + 1] + " " + arr[i + 2][j + 2] + " ");
            }
            System.out.println("----------------------");
        }
    }

    private static int calculate(int[][] arr) {
        int max = Integer.MIN_VALUE, sum = 0;
        int c = 1;
        for (int i = 0; i <= arr.length - 3; i++) {
            c = 1;
            for (int j = 0; j <= arr.length - 3; j++) {
                sum = 0;
                sum += arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][c++] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                System.out.println(sum);
                max = Math.max(max, sum);
            }

        }
        return max;
    }

}
