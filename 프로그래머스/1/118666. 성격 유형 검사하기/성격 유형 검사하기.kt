class Solution {
    fun abs(n: Int): Int = if (n >= 0) n else -n
    fun solution(survey: Array<String>, choices: IntArray): String {
        val comparisonTypes = arrayOf<String>("TR", "FC", "MJ", "NA")
        val allTypes = "RTCFJMAN".toCharArray()
        var scoresTemplate = IntArray(8) { 0 }
        
        
        var scores = mutableMapOf<Char, Int> ()
        var score = 0
        var index = 'A'
        for (each in allTypes) scores.put(each, 0)
        
        
        for (i in survey.indices) {
            if (choices[i] == 4) continue
            index = survey[i][if (choices[i] < 4) 0 else 1]
            score = scores.get(index)!! + abs(choices[i] - 4)
            scores.put(index, score)
        }
        
        var answer: String = ""
        for (i in comparisonTypes.indices)
            answer += if (scores.get(comparisonTypes[i][0])!! > scores.get(comparisonTypes[i][1])!!) comparisonTypes[i][0] else comparisonTypes[i][1]
        
        return answer
    }
}