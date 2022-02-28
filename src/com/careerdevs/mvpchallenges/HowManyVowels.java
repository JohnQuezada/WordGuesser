package com.careerdevs.mvpchallenges;

public class HowManyVowels {
    public static void main(String[] args) {
    getCount("Fiddle");
    }

    public static int getCount(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }
}
