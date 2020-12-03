package com.avijitsamanta.competitiveProgramming.HackerRank;

public class JavaStringTokens {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        s = s.trim();
        if (s.length()==0){
            System.out.println(0);
            return;
        }
        String[] words = s.split("[^a-zA-Z]+");
        System.out.println(words.length);
        for (String a : words)
            System.out.println(a);
    }
}
