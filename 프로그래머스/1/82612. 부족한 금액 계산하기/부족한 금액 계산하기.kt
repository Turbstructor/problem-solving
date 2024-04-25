class Solution {
    fun solution(price: Int, money: Int, count: Int): Long = -((money.toLong() - (price.toLong() * (count * (count + 1) / 2))).coerceAtMost(0))
}