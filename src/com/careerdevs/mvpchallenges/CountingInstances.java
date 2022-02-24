package com.careerdevs.mvpchallenges;

public class CountingInstances {
    public static void main(String[] args) {
        charCount('a', "apple");
    }

    public static int charCount(char a, String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a) count++;
        }
        return count;
    }
}
