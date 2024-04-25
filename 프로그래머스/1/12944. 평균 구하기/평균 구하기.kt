class Solution {
    fun solution(arr: IntArray): Double {
        var answer: Double = 0.0
        var sum: Int = 0
        
        for (each in arr) sum += each
        answer = sum.toDouble() / arr.size
        
        return answer
    }
}