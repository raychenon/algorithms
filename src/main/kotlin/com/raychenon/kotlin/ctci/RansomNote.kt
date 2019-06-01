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

        // no need to iterate all the magazine elements,
        // as soon as all words in noteMap are removed, exit the method
        if(noteMap.isEmpty()){
            return true
        }
    }

    return false
}


public fun checkMagazineFP(magazine: Array<String>, note: Array<String>): Boolean {
    if (magazine.size < note.size){
        return false
    }

    val noteMap = transformMap(note)
    for(m in magazine){
        if(noteMap.containsKey(m)){
            noteMap.put(m,noteMap.getValue(m)-1)
            if(noteMap.getValue(m) == 0){
                noteMap.remove(m)
            }
        }

        // no need to iterate all the magazine elements,
        // as soon as all words in noteMap are removed, exit the method
        if(noteMap.isEmpty()){
            return true
        }
    }

    return false
}

fun transformMap(array: Array<String>): Map<String, Int> {
    val map = mutableMapOf<String,Int>()
    for(n in array){
        map.put(n,map.getOrDefault(n,0) + 1)
    }
    return map
}