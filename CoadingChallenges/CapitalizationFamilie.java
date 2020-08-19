package com.avijitsamanta.CoadingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CapitalizationFamilie {


    private int countCapitalLetter(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        int count = 0;
        for (char c : a) {
            if (c >= 65 && c <= 91)
                count++;
            else
                return count;
        }
        return count;

    }

    private ArrayList<ArrayList<String>> capitalizationFormat(String[] arr) {
        HashMap<Integer, ArrayList<String>> ans = new HashMap<>();
        for (String str : arr) {
            int key = countCapitalLetter(str);

            if (!ans.containsKey(key))
                ans.put(key, new ArrayList<String>());

            ans.get(key).add(str);
        }

        return new ArrayList<>(ans.values());
    }

    public static void main(String[] args) {
        String[] arr = {"dOg", "cat", "ROOm", "SLEep", "New", "how", "hello", "optIon", "AVIJIT"};
        CapitalizationFamilie obj = new CapitalizationFamilie();
        ArrayList<ArrayList<String>> abcList = obj.capitalizationFormat(arr);
        System.out.println(abcList);
    }

}
