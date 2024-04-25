class Solution {
    fun solution(s: String): IntArray {
        var indexLastKnown = IntArray(26) { -1 }
        var distance = IntArray(s.length)
        var ord: Int
        
        for ((i, letter) in s.withIndex()) {
            ord = Character.getNumericValue(letter) - Character.getNumericValue('a')
            when (indexLastKnown[ord]) {
                -1 -> distance[i] = -1
                else -> distance[i] = (i - indexLastKnown[ord])
            }
            indexLastKnown[ord] = i
        }
        return distance
    }
}