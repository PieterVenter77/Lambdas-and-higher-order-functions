package com.example.pieter.higherorderandlambda

import org.junit.Assert
import org.junit.Test

class Lambdas {

    private val doubleInputValue = { x: Int -> x * 2 }
    private val addition: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    private val subtraction: (Int, Int) -> Int = { x: Int, y: Int -> x - y }
    private val multiplication: (Int, Int) -> Int = { x: Int, y: Int -> x * y }
    private val division: (Int, Int) -> Int = { x: Int, y: Int -> x / y }
    private val stringInterpolation: (String, String) -> String = { word1: String, word2: String -> "$word1 $word2" }
    private val interpolAndReverseWordsManually: (String, String) -> String = { word1: String, word2: String ->
        val result = "$word1$word2"
        var flippedResult = ""
        for (i in result.length-1 downTo 0) {
            flippedResult += result[i]
        }
        "$flippedResult :)"
    }

    @Test
    fun lambda_basics() {
        Assert.assertEquals(2, doubleInputValue(1))
        Assert.assertEquals(3, addition(1, 2))
        Assert.assertEquals(-1, subtraction(1, 2))
        Assert.assertEquals(2, multiplication(1, 2))
        Assert.assertEquals(2, division(2, 1))
        Assert.assertEquals("21 :)",interpolAndReverseWordsManually("1","2"))
        Assert.assertEquals("I understand", stringInterpolation("I", "understand"))
    }
}
