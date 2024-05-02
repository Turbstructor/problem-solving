class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var scoreCopy = score.sortedArray()
        
        var cursor = scoreCopy.size % m
        var profit = 0
        
        while (cursor < score.size) {
            profit += (m * scoreCopy[cursor])
            cursor += m
        }

        return profit
    }
}