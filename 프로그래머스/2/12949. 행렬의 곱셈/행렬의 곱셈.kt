class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size) { IntArray(arr2[0].size) }
        
        for (i in arr1.indices) {
            for (j in arr2[0].indices) {
                answer[i][j] = 0
                for (t in 0 until arr1[0].size)
                    answer[i][j] += (arr1[i][t] * arr2[t][j])
            }
        }
        
        return answer
    }
}