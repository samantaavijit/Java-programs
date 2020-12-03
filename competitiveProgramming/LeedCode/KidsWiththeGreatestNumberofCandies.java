package com.avijitsamanta.competitiveProgramming.LeedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

    private List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> list = new ArrayList<>();
        for (int a : candies)
            if (a + extraCandies >= max)
                list.add(true);
            else
                list.add(false);

        return list;
    }

    public static void main(String[] args) {
        KidsWiththeGreatestNumberofCandies obj = new KidsWiththeGreatestNumberofCandies();
        int nums[] = { 3, 5, 10, 3, 5, 2 };
        List<Boolean> list = obj.kidsWithCandies(nums, 5);
        System.out.println(list);
    }
}