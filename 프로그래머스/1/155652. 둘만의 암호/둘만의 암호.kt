class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer = ""
        var sEach = s.toCharArray()
        var letterInt: Int
        var steps: Int
        
        for (letter in sEach) {
            letterInt = letter.toInt()
            steps = 0
            
            while (steps < index) {
                letterInt += 1
                if (letterInt > 'z'.toInt()) letterInt = 'a'.toInt()
                if (letterInt.toChar() in skip) continue
                
                steps += 1
            }
            
            answer += letterInt.toChar()
        }
        
        return answer
    }
}