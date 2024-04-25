class Solution {
    fun solution(arr: IntArray): IntArray {
        var arrMinRemoved = arr.toMutableList()
        arrMinRemoved.remove(arrMinRemoved.minOrNull()!!)
        
        if (arrMinRemoved.isEmpty()) arrMinRemoved.add(-1)
        
        return arrMinRemoved.toIntArray()
    }
}