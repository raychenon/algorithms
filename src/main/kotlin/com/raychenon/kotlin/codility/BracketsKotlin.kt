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
        val map = mapOf(']' to '[','}' to '{',')' to '(','>' to '<')
        val openingSet = setOf('[','{','(','<')

        val stack = Stack<Char>()
        for(i in 0..str.length-1){
            val c = str[i]
            if(openingSet.contains(c)){
                stack.push(c)
            }

            if(map.containsKey(c)){
                if(stack.isEmpty() && map.get(c) == stack.peek()){
                    stack.pop()
                }else{
                    return false
                }
            }
            print("$i stack $stack \n")
        }

        return stack.isEmpty()
    }

    
}