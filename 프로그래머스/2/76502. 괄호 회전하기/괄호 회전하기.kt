class Solution {
    fun isValid(target: String): Boolean {
        val parenthesesOpening: Map<Char, Int> = mapOf('(' to 1, '[' to 2, '{' to 3)
        val parenthesesClosing: Map<Char, Int> = mapOf(')' to 1, ']' to 2, '}' to 3)
        val exprCode: IntArray = IntArray(target.length)
        var location: Int = -1
        var validity: Boolean = true
        
        for (each in target) {
            if (parenthesesOpening.contains(each)) exprCode[++location] = parenthesesOpening[each]!!
            else {
                if (location < 0) { validity = false; break }
                else if (exprCode[location] == parenthesesClosing[each]!!) location -= 1
                else { validity = false; break }
            }
        }
        if (validity) validity = (location == -1)
        
        return validity
    }
    
    fun solution(s: String): Int {
        val sRotated: Array<String> = Array<String>(s.length) { i -> (s.substring(i) + s.substring(0, i)) }
        return sRotated.count { it -> isValid(it) }
    }
}