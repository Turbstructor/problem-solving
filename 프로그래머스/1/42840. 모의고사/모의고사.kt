class Solution {
    fun solution(answers: IntArray): IntArray {
        var highest: MutableList<Int> = mutableListOf()
        
        val scores = IntArray(3) {0}
        val bro1 = intArrayOf(1, 2, 3, 4, 5)
        val bro2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val bro3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        
        for (each in answers.indices) {
            if (answers[each] == bro1[each % bro1.size]) scores[0] += 1
            if (answers[each] == bro2[each % bro2.size]) scores[1] += 1
            if (answers[each] == bro3[each % bro3.size]) scores[2] += 1
        }
        
        val maxScore = scores.maxOrNull()
        for (i in scores.indices)
            if (scores[i] == maxScore) highest.add(i + 1)
        
        return highest.toIntArray()
    }
}