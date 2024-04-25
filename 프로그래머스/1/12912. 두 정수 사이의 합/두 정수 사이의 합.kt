class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        
        val smaller = if (a <= b) a else b
        val larger = if (a <= b) b else a
        for (i in smaller..larger) answer += i
        
        return answer
    }
}