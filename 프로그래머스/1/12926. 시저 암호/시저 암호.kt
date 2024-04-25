class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        
        val uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val lowercaseLetters = uppercaseLetters.lowercase()
        
        s.toCharArray().forEach({
          answer += when (it) {
              in uppercaseLetters -> uppercaseLetters[(uppercaseLetters.indexOf(it) + n) % 26]
              in lowercaseLetters -> lowercaseLetters[(lowercaseLetters.indexOf(it) + n) % 26]
              else -> it
          }  
        })
        
        return answer
    }
}