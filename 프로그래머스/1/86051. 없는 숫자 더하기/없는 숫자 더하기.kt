class Solution {
    fun solution(numbers: IntArray): Int {
        var sum: Int = 45
        
        for (i in numbers) sum -= i
        
        return sum
    }
}