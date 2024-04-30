class Solution {
    fun solution(a: Int, b: Int): String {
        val daysOfMonth = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val daysOfWeekString = arrayOf<String>("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        var daysCount = 0
        
        for (i in 1 until a) daysCount += daysOfMonth[i - 1]
        daysCount += b

        return daysOfWeekString[(5 + daysCount - 1) % 7]
    }
}