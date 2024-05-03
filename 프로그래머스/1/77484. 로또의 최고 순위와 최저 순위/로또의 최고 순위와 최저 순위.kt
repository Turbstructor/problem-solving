class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var least = (7 - lottos.count({ it in win_nums })).coerceAtMost(6)
        var zeros = lottos.count({ it == 0 })
        
        return intArrayOf((least - zeros).coerceAtLeast(1), least)
    }
}