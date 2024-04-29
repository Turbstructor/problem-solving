class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        
        for (i in food.indices) {
            answer += i.toString().repeat(food[i] / 2)
        }
        
        answer = answer + "0" + answer.reversed()
        
        return answer
    }
}