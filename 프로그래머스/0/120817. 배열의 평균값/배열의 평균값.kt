class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var sum: Int = 0
        
        for (each in numbers) sum += each
        answer = sum.toDouble() / numbers.size
        
        return answer
    }
}