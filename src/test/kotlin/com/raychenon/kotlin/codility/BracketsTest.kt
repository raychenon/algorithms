package com.raychenon.kotlin.codility

import org.junit.Assert
import org.junit.Test

class BracketsTest {

    @Test
    fun evaluateBrackets(){
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets(""), true)

        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{}"),true)
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{[()()]}"),true)

        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("([)>>()]"), false)
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("([)()]"), false)

        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{[()<>()]}"), true)
        // can contain other characters
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{an}"), true)
        Assert.assertEquals(BracketsKotlin.hasBalancedBrackets("{any}"), true)
    }

}