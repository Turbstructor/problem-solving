class Solution {
    fun solution(babbling: Array<String>): Int {
        var speakable = 0
        var babble = arrayOf<String>("aya", "ye", "woo", "ma")
        var babblesToDigit = ""
        var isSpeakable: Boolean
        var prev: Int

        for (each in babbling) {
            isSpeakable = true
            babblesToDigit = each
            babble.forEachIndexed { index, eachBabble ->
                babblesToDigit = babblesToDigit.replace(eachBabble, (index + 1).toString())
            }
            
            prev = 0
            for (number in babblesToDigit) {
                if (number !in "1234") { isSpeakable = false; break }
                else if (number.toInt() == prev) { isSpeakable = false; break }
                
                prev = number.toInt()
            }
            
            speakable += if (isSpeakable) 1 else 0
        }
        
        return speakable
    }
}