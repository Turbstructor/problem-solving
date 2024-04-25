class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val dividers = arr.toCollection(ArrayList()).filter({ it % divisor == 0 }).toCollection(ArrayList())
        
        when (dividers.size) {
            0 -> dividers.add(-1)
            else -> dividers.sort()
        }
        
        return dividers.toIntArray()
    }
}