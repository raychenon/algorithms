package com.raychenon.kotlin.codility

import java.util.*

/**
 * User: raychenon
 * Date: 6/1/19
 * Time: 10:38 PM
 * https://codility.com/programmers/task/brackets/
 */

object BracketsKotlin {

    fun hasBalancedBrackets(str: String) : Boolean {
        if(str.isEmpty()) return true
        
        val map = mapOf(']' to '[','}' to '{',')' to '(','>' to '<')
        val openingSet = setOf('[','{','(','<')

        val stack = Stack<Char>()
        for((index,c) in str.withIndex()){
            if(openingSet.contains(c)){
                stack.push(c)
            }

            if(map.containsKey(c)){
                if(!stack.isEmpty() && map.getValue(c) == stack.peek()){
                    stack.pop()
                } else{
                    return false
                }
            }
        }

        return stack.isEmpty()
    }

    
}