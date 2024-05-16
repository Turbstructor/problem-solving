import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        var monthsValid = mutableMapOf<String, Long>()
        var dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd")
        var splittedParts: List<String>
        val todayDate = LocalDate.parse(today, dateFormatter)
        var answer: MutableList<Int> = mutableListOf()
        
        for (each in terms) {
            splittedParts = each.split(" ")
            monthsValid.put(splittedParts[0], splittedParts[1].toLong())
        }
    
        
    
        for (i in privacies.indices) {
            splittedParts = privacies[i].split(" ")
            if (!todayDate.isBefore(LocalDate.parse(splittedParts[0], dateFormatter).plusMonths(monthsValid[splittedParts[1]]!!))) answer.add(i + 1)
        }
    
        return answer.toIntArray()
    }
}