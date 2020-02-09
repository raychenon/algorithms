package com.raychenon.kotlin.leetcode


/**
 * User: raychenon
 * Date: 5/2/2020
 * https://leetcode.com/problems/most-common-word/
 */
object MostCommonWord {

    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val re = Regex("\\W+")
        val paragraphNoPunctuation = re.replace(paragraph, " ")
        val words: Array<String> = paragraphNoPunctuation.toLowerCase().split(" ")
            .map { w -> w.replace(" ", "") }.toTypedArray()
        var mapFrequency = mutableMapOf<String, Int>()
        val bannedSet = banned.toSet()

        for (word in words) {
            if (!bannedSet.contains(word)) {
                mapFrequency.put(word, mapFrequency.getOrDefault(word, 0) + 1)
            }
        }
        mapFrequency.remove("")

        return mapFrequency.maxBy { it.value }?.let { it.key }
            ?: run { "" }
    }
}