package com.raychenon.kotlin.codility

import com.raychenon.codility.Brackets
import org.junit.Assert
import org.junit.Test

class BracketsTest {

    @Test
    fun evaluateBrackets(){

        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{}"),true)
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{[()()]}"),true)

        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("([)>>()]"), false)
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("([)()]"), false)

        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{[()<>()]}"), true)
        // can contain other characters
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{an}"), true)
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{any}"), true)
    }

    @Test
    fun evaluateEmptyBrackets(){
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets(""), true)
    }

    @Test
    fun assertOneSidedBracketsSolution() {
        Assert.assertEquals(Brackets.hasBalancedBrackets("{["), false)
        Assert.assertEquals(Brackets.hasBalancedBrackets("{"), false)
    }

}