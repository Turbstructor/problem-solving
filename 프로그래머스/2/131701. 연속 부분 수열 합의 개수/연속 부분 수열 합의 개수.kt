class Solution {
    fun solution(elements: IntArray): Int {
        val allSums: MutableSet<Int> = mutableSetOf()
        val total = elements.sum()
        var sumPartial = 0
        var indexFirst = 0
        var indexLast = 0
        
        allSums.add(total)
        
        for(i in 1 .. ((elements.size + 1) / 2)) {
            indexFirst = 0
            indexLast = (i - 1)
            
            sumPartial = elements.take(i).sum()
            allSums.add(sumPartial)
            allSums.add(total - sumPartial)
            
            while(true) {
                sumPartial -= elements[indexFirst]
                indexFirst += 1
                
                if (indexFirst >= elements.size) break

                indexLast += 1
                sumPartial += elements[indexLast - (if (indexLast >= elements.size) elements.size else 0)]
                
                allSums.add(sumPartial)
                allSums.add(total - sumPartial)
            }
        }
        
        return allSums.size
    }
}