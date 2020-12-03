package com.avijitsamanta.competitiveProgramming.HackerRank;

public class ValidUsernameRegularExpression {

    public static void main(String[] args) {
        String userName = "ABVrgjh1d_hZZhdhf";

        String regex = "^[a-zA-Z_0-9]\\\\w{7,29}+$";
        String regex2 = "^[aA-zZ]\\\\w{7,29}$";
        if (userName.matches(regex2)) {
            System.out.println("valid");
        } else System.out.println("in valid");
        
    }
}
