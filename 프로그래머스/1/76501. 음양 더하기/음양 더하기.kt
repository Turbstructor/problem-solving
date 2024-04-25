class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var sum = 0
        
        for (i in 0 until absolutes.size) sum += (absolutes[i] * (if (signs[i]) 1 else -1))
        
        return sum
    }
}