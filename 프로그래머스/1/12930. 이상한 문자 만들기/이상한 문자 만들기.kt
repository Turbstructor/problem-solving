class Solution {
    fun solution(s: String): String {
        var words = s.split(" ").toMutableList()

        for (i in words.indices) {
            var letters = words[i].toCharArray()
            for (j in letters.indices)
                letters[j] = if (j % 2 == 0) letters[j].uppercaseChar() else letters[j].lowercaseChar()
            words[i] = letters.joinToString("")
        }
        
        return words.joinToString(" ")
    }
}