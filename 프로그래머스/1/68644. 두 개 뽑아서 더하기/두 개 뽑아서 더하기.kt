class Solution {
    fun solution(numbers: IntArray): IntArray {
        var pairsOfAddition = mutableSetOf<Int>()

        for (i in 0 until (numbers.size - 1))
            for (j in (i + 1) until (numbers.size)) pairsOfAddition.add(numbers[i] + numbers[j])
        
        return pairsOfAddition.sorted().toIntArray()
    }
}