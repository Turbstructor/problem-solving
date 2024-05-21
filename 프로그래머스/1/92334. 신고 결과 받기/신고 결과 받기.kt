class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        var answer = IntArray(id_list.size)
        
        var reporteeIndividual = mutableMapOf<String, MutableList<String>>()
        var status = mutableMapOf<String, Int>()
        for (id in id_list){ status.put(id, 0); reporteeIndividual.put(id, mutableListOf()) }
        
        for (each in report) {
            val (reporter, reportee) = each.split(" ")
            
            if (reportee !in reporteeIndividual[reporter]!!) {
                status.put(reportee, status[reportee]!! + 1)
                reporteeIndividual[reporter]!!.add(reportee)
            }
        }
        
        id_list.forEachIndexed { index, id ->
            for (reportee in reporteeIndividual[id]!!) {
                if (status[reportee]!! >= k)
                    answer[index] += 1
            }
        }
        
        
        return answer
    }
}