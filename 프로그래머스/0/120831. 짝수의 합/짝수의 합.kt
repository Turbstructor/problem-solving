class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        for (i in 1..n) answer += (if (i % 2 == 0) i else 0)
        return answer
    }
}