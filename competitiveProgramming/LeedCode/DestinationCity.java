package com.avijitsamanta.competitiveProgramming.LeedCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

Input: paths = [["B","C"],["D","B"],["C","A"]]
Output: "A"
Explanation: All possible trips are: 
"D" -> "B" -> "C" -> "A". 
"B" -> "C" -> "A". 
"C" -> "A". 
"A". 
Clearly the destination city is "A".
*/
public class DestinationCity {

    private void destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> l : paths){
            set.add(l.get(1));
            System.out.println(l.get(0)+" "+l.get(1));
        }
            
        for (List<String> l : paths)
            set.remove(l.get(0));
        System.out.println(set);
        // return set.iterator().next();
    }

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> ll = new ArrayList<>();
        ll.add("London");
        ll.add("New York");
        list.add(ll);
        ll.add("New York");
        ll.add("Lima");
        list.add(ll);

        DestinationCity obj = new DestinationCity();
        obj.destCity(list);
    }
}