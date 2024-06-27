class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        val items = mutableMapOf<String, Int>()
        val goal = mutableMapOf<String, Int>()
        for (i in want.indices) {
            items.put(want[i], 0)
            goal.put(want[i], number[i])
        }
        
        var availableDays: Int = 0
        var isSame: Boolean = false
        
        for (i in 0..8)
            items[discount[i]] = (items[discount[i]] ?: 0) + 1
        
        for (i in 9 until discount.size) {
            items[discount[i]] = (items[discount[i]] ?: 0) + 1
            
            isSame = true
            for (each in goal.keys)
                if (items[each] != goal[each]){ isSame = false; break }
            
            if(isSame) availableDays += 1
            
            items[discount[i - 9]] = (items[discount[i - 9]] ?: 0) - 1
        }
        
        return availableDays
    }
}