class Solution {
    fun solution(s: String): String =
    s.split(" ").map { it.lowercase().replaceFirstChar { it.toTitleCase() }}.joinToString(" ")
}