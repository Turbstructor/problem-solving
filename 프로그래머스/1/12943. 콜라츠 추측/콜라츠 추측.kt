class Solution {
    fun solution(num: Int): Int {
        var n: Long = num.toLong()
        
        var steps = 0
        while (steps <= 500 && n != 1L) { n = (if (n % 2 == 0L) (n / 2L) else (n * 3 + 1)); steps ++ }
        
        return if (steps <= 500) steps else -1
    }
}