package com.sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

       long rest =  countSimilarPairs(Arrays.asList("aba", "abbca", "dsd", "a"));
        System.out.println(rest);
    }

    public static long countSimilarPairs(List<String> words) {
        // Write your code here

        int highestPair = 0;
        for (int i = 0; i < words.size(); i++) {

            if ( !(words.size() <= i+1)) {
                String firstWord = words.get(i);

                String secondWord = words.get(i + 1);

                boolean result = false;
                for (int j = 0; j < firstWord.length(); j++) {
                    int finalJ = j;
                    result = secondWord.chars().anyMatch(ch -> firstWord.charAt(finalJ) == ch);
                    if (!result) {
                        break;
                    }
                }

                if (result) {
                    highestPair++;
                }
            }

        }

        return highestPair;
    }


}
