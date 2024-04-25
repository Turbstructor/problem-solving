class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        
        var nDigits = n
        while (nDigits > 0){ answer += (nDigits % 10); nDigits /= 10 }

        return answer
    }
}