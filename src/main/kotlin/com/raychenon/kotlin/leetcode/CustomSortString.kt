package com.raychenon.kotlin.leetcode

/**
 * User: raychenon
 * Date: 2019-11-06
 * https://leetcode.com/problems/custom-sort-string/
 */
object CustomSortString {

    fun customSortString(S: String, T: String): String {
        var map = mutableMapOf<Char,Int>()
        for(c in T){
            map.put(c,map.getOrDefault(c,0)+1)
        }
        //println("map = $map")
        // add chars from S
        var str = StringBuilder()
        for(c in S){
            if(map.contains(c)){
                for(i in 1.. map.getOrDefault(c,0)){
                    str.append(c)
                }
                map.remove(c)
            }
        }
        //println("map = $map")


        for((k,v) in map){
            for(i in 1..v){
                str.append(k)
            }
        }
        //println("str = $str")

        return str.toString()
    }
    
}