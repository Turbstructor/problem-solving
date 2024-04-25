class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        
        var numOfDigit: Int = 0
        var nVar = n
        while (nVar > 0) { numOfDigit ++; nVar /= 10 }
        
        var digits = LongArray(numOfDigit)
        nVar = n
        for (i in 0 until numOfDigit) { digits[i] = (nVar % 10); nVar /= 10 }
        
        digits.sortDescending()
        
        for (digit in digits) { answer *= 10; answer += digit }
        
        return answer
    }
}