class Solution {
    fun solution(x: Int): Boolean {
        var nX: Int = x
        var sum: Int = 0
        
        while (nX > 0) { sum += (nX % 10); nX /= 10 }
        
        return (x % sum == 0)
    }
}