import kotlin.math.*

class Solution {
    fun isSquare(n: Int): Boolean = (truncate(sqrt(n.toDouble())).pow(2).compareTo(n) == 0)
    fun solution(left: Int, right: Int): Int {
        var sum = 0
        for (i in left..right) sum += (i * (if (isSquare(i)) -1 else 1))
        
        return sum
    }
}