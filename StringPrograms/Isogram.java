package com.avijitsamanta.StringPrograms;

import java.util.HashMap;

/*
Given a string S of lowercase aplhabets,
 check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.
 Input:
2
machine
geeks
Output:
1
0
 */
public class Isogram {

    private static boolean isIsogram(String data) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : data.toCharArray()) {
            if (map.containsKey(c))
                return false;
            map.put(c, 0);
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(isIsogram(str));
    }
}
