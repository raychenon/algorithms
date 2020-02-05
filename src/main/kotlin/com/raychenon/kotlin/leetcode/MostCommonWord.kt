package com.raychenon.kotlin.leetcode


/**
 * User: raychenon
 * Date: 5/2/2020
 * https://leetcode.com/problems/most-common-word/
 */
object MostCommonWord {

    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val re = Regex("[^A-Za-z0-9 ]")
        val paragraphNoPunctuation = re.replace(paragraph, " ")
        val words: Array<String> = paragraphNoPunctuation.toLowerCase().split(" ").toTypedArray()
        var mapFrequency = mutableMapOf<String, Int>()

        for (word in words) {
            mapFrequency.put(word, mapFrequency.getOrDefault(word, 0) + 1)
        }

        for (ban in banned) {
            if (mapFrequency.containsKey(ban)) {
                mapFrequency.remove(ban)
            }
        }

        val max = mapFrequency.maxBy { it.value }
        return max?.key!!
    }
}