class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val tangerinesBySize: List<Pair<Int, Int>> =
        tangerine.toSet().map { it to tangerine.count{ each -> each == it } }
        .sortedWith(compareBy( { it.second }, { it.first } ))
        
        var answer: Int = tangerinesBySize.size
        var tangerinesLeft = tangerine.size
        for (each in tangerinesBySize) {
            answer -= 1
            tangerinesLeft -= each.second
            
            if(tangerinesLeft <= k) break
        }
        
        return if(tangerinesLeft < k) (answer + 1) else answer
    }
}