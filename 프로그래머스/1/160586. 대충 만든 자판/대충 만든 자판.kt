class Solution {
    fun min(a: Int, b: Int): Int = if (a <= b) a else b
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer = ArrayList<Int>()
        var availableKeymaps = keymap.joinToString("").toCharArray().toSet()
        
        var distances = IntArray(26) { 100 }
        var letterInteger: Int
        
        for (each in keymap) {
            for (letter in each) {
                letterInteger = (letter.toInt() - 'A'.toInt())
                distances[letterInteger] = min(distances[letterInteger], (each.indexOf(letter) + 1))
            }
        }
        
        for (target in targets) {
            if (target.any { it !in availableKeymaps }) answer.add(-1)
            else answer.add(target.toCharArray().sumOf { distances[it.toInt() - 'A'.toInt()] })
        }
        
        return answer.toIntArray()
    }
}