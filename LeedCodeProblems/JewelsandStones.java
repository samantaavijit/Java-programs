package com.avijitsamanta.LeedCodeProblems;

import java.util.HashMap;

/*
 * Input: J = "aA", S = "aAAbbbb" Output: 3 Input: J = "z", S = "ZZ" Output: 0
 */
public class JewelsandStones {

    private int numJewelsInStones(String J, String S) {
        HashMap<String, Integer> myMap = new HashMap<>();
        int count = 0;
        for (char c : J.toCharArray())
            if (!myMap.containsKey(String.valueOf(c)))
                myMap.put(String.valueOf(c), 1);

        for (char c : S.toCharArray())
            if (myMap.containsKey(String.valueOf(c)))
                count++;
        return count;

    }

    public static void main(String[] args) {
        JewelsandStones obj = new JewelsandStones();
        System.out.println(obj.numJewelsInStones("Aa", "AAabbBBa"));
    }
}