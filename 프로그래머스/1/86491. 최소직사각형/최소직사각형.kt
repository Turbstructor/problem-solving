import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var w = 0
        var h = 0
        var larger: Int
        var smaller: Int
        
        for (each in sizes) {
            larger = max(each[0], each[1]) 
            smaller = min(each[0], each[1]) 
            
            w = max(w, larger)
            h = max(h, smaller)
        }
        
        return (w * h)
    }
}