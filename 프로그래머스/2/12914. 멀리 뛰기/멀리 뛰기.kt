class Solution {
    fun solution(n: Int): Long {
        var a = 1L
        var b = 1L
        var c = (a + b)
        
        for (i in 2..n) {
            c = (a + b) % 1234567
            a = b
            b = c
        }

        return b
    }
}