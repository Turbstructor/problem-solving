class Solution {
    fun solution(s: String): Int {
        var parts = 0
        var startIndex = 0
        var isNewPart = true
        var cnt = IntArray(2) { 0 }
        
        for (i in s.indices) {
            if(isNewPart) {
                startIndex = i
                cnt[0] += 1
                isNewPart = false
            }
            else {
                if(s[startIndex] == s[i]) cnt[0] += 1
                else cnt[1] += 1
                
                if(cnt[0] == cnt[1]) {
                    cnt.fill(0)
                    isNewPart = true
                    parts += 1
                }
            }
        }
        
        if(cnt.sum() != 0) parts += 1
        
        
        return parts
    }
}