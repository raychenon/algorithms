package com.raychenon.kotlin.ctci

/**
 * User: raychenon
 * Date: 23/1/19
 * https://www.hackerrank.com/challenges/ctci-ransom-note/problem
 */

public fun checkMagazine(magazine: Array<String>, note: Array<String>): String {
    if (magazine.size < note.size){
        return "No"
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

            if(noteMap.size == 0){
                return "Yes"
            }
        }
    }

    return "No"
}