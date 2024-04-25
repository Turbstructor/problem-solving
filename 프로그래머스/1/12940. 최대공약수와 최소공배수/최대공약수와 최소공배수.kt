import kotlin.math.*
class Solution {
    fun gcd(a: Int, b: Int): Int = (if (a % b == 0) b else gcd(b, (a % b)))
    fun solution(n: Int, m: Int): IntArray {
        val smaller = min(n, m)
        var larger = max(n, m)
        
        return intArrayOf(gcd(larger, smaller), (smaller * larger) / gcd(larger, smaller))
    }
}