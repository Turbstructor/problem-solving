class Solution {
    fun min(a: Int, b: Int): Int = if (a <= b) a else b
    fun max(a: Int, b: Int): Int = if (a >= b) a else b
    fun solution(wallpaper: Array<String>): IntArray {
        var answer: IntArray = intArrayOf(51, 51, -1, -1)
        
        for (i in wallpaper.indices) {
            for (j in wallpaper[i].indices) {
                if (wallpaper[i][j] == '#') {
                    answer[0] = min(answer[0], i)
                    answer[1] = min(answer[1], j)
                    answer[2] = (max(answer[2], i + 1))
                    answer[3] = (max(answer[3], j + 1))
                }
            }
        }
        
        return answer
    }
}