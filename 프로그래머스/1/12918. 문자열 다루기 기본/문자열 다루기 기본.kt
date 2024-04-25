class Solution {
    fun solution(s: String): Boolean {
        try {
            return when(s.length) {
                4, 6 -> (s.toInt() >= 0)
                else -> false
            }
        } catch (e: NumberFormatException){ return false }
    }
}