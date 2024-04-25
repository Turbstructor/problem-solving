class Solution {
    fun solution(t: String, p: String): Int {
        var count = 0
        val pLong = p.toLong()
        
        for (i in 0..(t.length - p.length))
            count += if (t.substring(i..(i + p.length - 1)).toLong() <= pLong) 1 else 0
        
        return count
    }
}