package com.raychenon.kotlin.ctci

/**
 * User: raychenon
 * Date: 23/1/19
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */

/**
 *
 * The main idea is that in order to create ransom note from a magazine,
 * all the string in Note must contained in the Magazine.
 *
 * All string of Note are decremented from Magazine.
 * Note is first converted into a Map of frequency by string to be timely efficient for a string search.
 *
 * M is the size of Magazine
 * N is the size of Note
 * time complexity : O(n) = O(M+N)
 * space complexity : O(N)
 */
public fun checkMagazine(magazine: Array<String>, note: Array<String>): Boolean {
    if (magazine.size < note.size){
        return false
    }

    val noteMap = mutableMapOf<String,Int>()
    for(n in note){
        noteMap.put(n,noteMap.getOrDefault(n,0) + 1)
    }
    for(m in magazine){
        if(noteMap.containsKey(m)){
            noteMap.put(m,noteMap.getValue(m)-1)
            if(noteMap.getValue(m) == 0){
                noteMap.remove(m)
            }
        }

        if(noteMap.size == 0){
            return true
        }
    }

    return false
}