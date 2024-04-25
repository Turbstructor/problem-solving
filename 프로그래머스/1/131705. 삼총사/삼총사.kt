class Solution {
    fun solution(number: IntArray): Int {
        var i: Int
        var j: Int
        var k: Int
        
        var count = 0
        for (i in 0 until (number.size - 2))
            for (j in (i + 1 until (number.size - 1)))
                for (k in (j + 1) until number.size)
                    count += (if (number[i] + number[j] + number[k] == 0) 1 else 0)

        return count
    }
}