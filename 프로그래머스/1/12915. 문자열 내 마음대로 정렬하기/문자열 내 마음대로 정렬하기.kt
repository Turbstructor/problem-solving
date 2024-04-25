class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> = strings.toList().sortedWith(compareBy({ it[n] }, {it} )).toTypedArray()
}