class Solution {
    fun solution(s: String): Int {
        val numberWords = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        var sVar = s
        numberWords.forEachIndexed{ index, word -> run { sVar = sVar.replace(word, index.toString()) } }
        
        return sVar.toInt()
    }
}