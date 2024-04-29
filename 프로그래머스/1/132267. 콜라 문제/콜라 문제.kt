class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0

        var nVar = n
        var ret: Int
        do {
            ret = (nVar / a) * b
            answer += ret
            nVar = ret + (nVar % a)
        } while(ret > 0)
        return answer
    }
}