package com.raychenon.codility;


import java.util.*;

/**
 * User: raychenon
 * Date: 21/12/18
 * Time: 5:27 PM
 * https://codility.com/programmers/task/brackets/
 */
public class Brackets {

    public static void main(String[] args) {
        List<String> seq = Arrays.asList("{[()()]}", "([)>>()]", "{[()<>()]}", "{[()<ab>()]}");
        for(String s : seq) {
            System.out.println("String  = " + s + " , " + hasBalancedBrackets(s) );
        }
    }


    /**
     * the main idea is for any opening characters (,{,[,<  must be followed
     * by closing character ),},],> after ( can be many next characters after )
     * @param S
     * @return boolean , whether the string S contains balanced brackets
     */
    public static boolean hasBalancedBrackets(String S) {
        if (S.isEmpty()) return true;
        if (S.length() % 2 == 1) return false;  // cannot have an odd number

        Map<Character, Character> closing2OpeningCharMap = new HashMap<Character, Character>();
        closing2OpeningCharMap.put('}', '{');
        closing2OpeningCharMap.put(')', '(');
        closing2OpeningCharMap.put(']', '[');
        closing2OpeningCharMap.put('>', '<');

        Set<Character> openingSet = new HashSet<Character>(Arrays.asList('(', '{', '[', '<'));

        Stack<Character> stack = new Stack<Character>();
        for (Character c : S.toCharArray()) {
            if (closing2OpeningCharMap.containsKey(c)) {
                if (!stack.isEmpty() && closing2OpeningCharMap.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            if (openingSet.contains(c)) {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
