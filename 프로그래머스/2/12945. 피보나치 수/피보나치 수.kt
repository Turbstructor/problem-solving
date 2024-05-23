class Solution {
    fun solution(n: Int): Int {
        var a = 0
        var b = 1
        var c = 0
        
        for (i in 2..n) {
            c = (a + b) % 1234567
            a = b
            b = c
        }
        
        return c
    }
}