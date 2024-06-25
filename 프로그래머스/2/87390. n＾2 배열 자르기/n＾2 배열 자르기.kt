class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer: IntArray = IntArray((right - left).toInt() + 1)
        
        var row: Int = 0
        var col: Int = 0
        var cnt: Int = 0
        
        for (i in left..right) {
            row = (i / n).toInt()
            col = (i % n).toInt()
            
            answer[cnt++] = (if (col <= row) row else col) + 1
        }
        
        return answer
    }
}