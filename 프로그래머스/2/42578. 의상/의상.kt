class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val category = mutableSetOf<String>()
        val categoryCount = mutableMapOf<String, Int>()
        
        for (each in clothes) {
            if (!category.contains(each[1])) category.add(each[1])
            categoryCount[each[1]] = (categoryCount[each[1]] ?: 0) + 1
        }
        var answer = 1
        var combinations = 1
   
        for (each in category)
            answer *= (categoryCount[each]!! + 1)
        
        answer -= 1
        
        return answer
    }
}