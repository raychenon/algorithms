package com.raychenon.kotlin

/**
 * User: raychenon
 * Date: 2019-09-19
 * https://github.com/raychenon/algorithms/issues/97
 */
object T9Text {

    /**
     * After the pre-processing a dictionnary,
     * the search time is roughly constant O(1)
     * time complexity: O(1)
     * space complexity: due to Dictionary , see [preProcess]
     */
    fun filterWords(keypad: Int, dictionary: Map<Int, Set<String>>): Set<String> {
        return dictionary.getOrDefault(keypad, emptySet<String>())
    }

    /**
     * Given a list of words of size M, assume that each word has a length of W.
     * time complexity: O(M)
     * space complexity: O(M + K * W) , where K is the number of entries in the dictionary(Map)
     */
    fun preProcess(words: List<String>): Map<Int, Set<String>> {
        val dictionary = mutableMapOf<Int, MutableSet<String>>()
        for (word in words) {
            var key = 0
            for (c in word) {
                key = key * 10 + convertToKeypadNum(c)
            }

            if (dictionary.containsKey(key)) {
                val set = dictionary.get(key)!!
                set.add(word)
            } else {
                val set = mutableSetOf<String>(word)
                dictionary.put(key, set)
            }
        }
        return dictionary
    }

    fun convertToKeypadNum(c: Char): Int {
        return when (c) {
            'a', 'b', 'c' -> 2
            'd', 'e', 'f' -> 3
            'g', 'h', 'i' -> 4
            'j', 'k', 'l' -> 5
            'm', 'n', 'o' -> 6
            'p', 'q', 'r', 's' -> 7
            't', 'u', 'v' -> 8
            'w', 'x', 'y', 'z' -> 9
            else -> 0
        }
    }

}