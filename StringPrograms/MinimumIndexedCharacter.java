package com.avijitsamanta.StringPrograms;

import java.util.HashSet;

/*
Given a string str and another string patt. Find the character in patt
that is present at the minimum index in str.
If no character of patt is present in str then print ‘No character present’.
Input:
geeksforgeeks
set
adcffaet
onkl
Output:
e
No character present
 */
public class MinimumIndexedCharacter {
    public static void solution(String s1, String s2) {
        int i,l1=s1.length(),l2=s2.length();
        HashSet<Character> hs= new HashSet<>();
        for(i=0;i<l2;i++)
            hs.add(s2.charAt(i));
        for(i=0;i<l1;i++)
            if(hs.contains(s1.charAt(i)))
                break;
        if(i<l1)
            System.out.println(s1.charAt(i));
        else
            System.out.println("No character present");
    }

    public static void main(String[] args) {
        solution("geeksforgeeks","set");
        solution("adcffaet","onkl");
        solution("laacbjfedrkwollbhfqfvkvpndxetrvetvgvenb","jflhvzuwgconxaionnnugfpky");
        solution("vsizcnmjilegtiugfxqtkeggknxxojrlczmgozrykxgefdmkadfmjotvdsuremfgnroeqfeddljkqvvqacejszfwszpwnue","douhezn");
    }
}
