package com.raychenon.hackerrank;

import java.util.*;

/**
 * User: raychenon
 * Date: 18/1/19
 * Time: 9:44 PM
 * Under "Dictionaries and Hashmaps"
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 */
public class SherlockAndAnagrams {

    /**
     * time complexity : O(nˆ2)
     * space complexity : O(?)
     * @param s
     * @return
     */
    static int sherlockAndAnagrams(String s) {
        Map<Map<Character,Integer>, Integer> mapFrequency = new HashMap<Map<Character,Integer>, Integer>();

        int totalCount = 0;

        // Generate all substrings (N^2)
        for(int i = 0 ; i < s.length(); i++) {
            for(int j=i+1 ; j <= s.length(); j++) {
                String currentSubString = s.substring(i, j);

                Map<Character,Integer> key = createKey(currentSubString);

                if (mapFrequency.containsKey(key)){
                    int value = mapFrequency.getOrDefault(key, 0);
                    totalCount=totalCount+value;

                    // Increment the times we've seen the string
                    mapFrequency.put(key, value+1);
                }else{
                    mapFrequency.put(key,1);
                }

            }
        }

        return totalCount;
    }


    /**
     * generate a Key from the substring
     * This key is map of frequency of each letter in the substring
     * @param subString
     * @return
     */
    private static Map<Character,Integer> createKey(String subString){
        Map map =  new HashMap<Character,Integer>();
        for(int i = 0 ; i < subString.length(); i++){
            Character c = subString.charAt(i);

            int count = (int) map.getOrDefault(c,0);
            map.put(c, ++count);
        }
        return map;
    }
    
}
