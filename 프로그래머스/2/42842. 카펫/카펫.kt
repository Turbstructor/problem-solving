class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = IntArray(2)
        
        var width: Int = 0
        var height: Int = 0
        
        val area: Int = (brown + yellow)
        val edge: Int = (brown + 4)
        
        for(i in 1..(edge))
        {
            height = i
            width = (edge / 2) - height
            
            if(width * height == area) break
        }
        
        answer[0] = width
        answer[1] = height
        
        return answer
    }
}