class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var steps = IntArray(2) { 0 }
        var isPossible = true
        
        for (word in goal) {
            if (steps[0] < cards1.size && cards1[steps[0]] == word) steps[0] += 1
            else if (steps[1] < cards2.size && cards2[steps[1]] == word) steps[1] += 1
            else { isPossible = false; break }
        }
        
        return (if (isPossible) "Yes" else "No")
    }
}