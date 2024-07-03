class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val progressesDaily = progresses.copyOf()
        var progressCursor = 0
        var distCount = mutableListOf<Int>()
        var distCountCursor = -1
        
        while (progressCursor < progressesDaily.size) {
            for (i in progressesDaily.indices)
                progressesDaily[i] += speeds[i]
            
            if (progressesDaily[progressCursor] >= 100) {
                distCount.add(0)
                distCountCursor += 1
                while (progressCursor < progressesDaily.size && progressesDaily[progressCursor] >= 100) {
                    distCount[distCountCursor] += 1
                    progressCursor += 1
                }
            }
        }
        
        return distCount.toIntArray()
    }
}