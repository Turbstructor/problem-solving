class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
 
        var aInternal: Int = a
        var bInternal: Int = b
        
        while(((aInternal + 1) shr 1) != ((bInternal + 1) shr 1))
        {   
            aInternal = if(aInternal % 2 == 0) (aInternal shr 1) else ((aInternal + 1) shr 1)
            bInternal = if(bInternal % 2 == 0) (bInternal shr 1) else ((bInternal + 1) shr 1)
            
            answer += 1
        }

        return answer
    }
}