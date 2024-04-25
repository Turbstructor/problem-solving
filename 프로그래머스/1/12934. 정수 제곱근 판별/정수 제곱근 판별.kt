import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        
        var rt: Double = sqrt(n.toDouble())
        answer = if (rt.compareTo(rt.toLong()) == 0) ((truncate(rt) + 1.0).pow(2).toLong()) else -1
        
        return answer
    }
}