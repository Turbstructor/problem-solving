class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        var sVar = s
        var n = 0
        while (n != 1) {
            n = sVar.count { it == '1' }
            answer[0] += 1
            answer[1] += (sVar.length - n)
            sVar = n.toString(2)
        }
        
        return answer
    }
}