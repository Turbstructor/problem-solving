class Solution {
    fun solution(X: String, Y: String): String {
        val digitsX = IntArray(10) { i -> X.count({ it == i.digitToChar() }) }
        val digitsY = IntArray(10) { i -> Y.count({ it == i.digitToChar() }) }
        val digits = IntArray(10) { i -> intArrayOf(digitsX[i], digitsY[i]).minOrNull()!! }
        
        var answer: String = ""
        for (i in 9 downTo 1) answer += i.digitToChar().toString().repeat(digits[i])
        answer += if(!answer.isEmpty()) "0".repeat(digits[0]) else if(digits[0] != 0) "0" else ""
        
        return if (answer.isEmpty()) "-1" else answer
    }
}