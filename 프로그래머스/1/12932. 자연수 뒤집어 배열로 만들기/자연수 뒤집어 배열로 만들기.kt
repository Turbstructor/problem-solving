class Solution {
    fun solution(n: Long): IntArray {
        var digits: Int = 0
        var nVar: Long = n
        
        while (nVar > 0) { digits ++; nVar /= 10 }
        
        nVar = n
        var answer = IntArray(digits)
        
        for (i in 0 until digits) { answer[i] = (nVar % 10).toInt(); nVar /= 10 }
        
        return answer
    }
}