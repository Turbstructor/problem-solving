class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = IntArray(score.size)
        
        val lst = mutableListOf<Int>()
        for (i in score.indices) {
            lst += score[i]
            answer[i] = lst.sorted().reversed()[if (lst.size < k) i else (k - 1)]
        }
                
        
        return answer
    }
}