class Solution {
    fun solution(s: String): String {
        val arr = s.split(" ").map { it.toInt() }.toIntArray()
        return "${arr.minOrNull()!!} ${arr.maxOrNull()!!}"
    }
}