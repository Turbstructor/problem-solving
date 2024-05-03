class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var paints = 0
        var sectionsLeft = section.size
        var left = 0
        var right = section.size - 1
        var startPoint: Int
        
        while (sectionsLeft > 0) {
            startPoint = if (paints % 2 == 0) section[left] else section[right]
            if (paints % 2 == 0) {
                while (left < section.size && section[left] < (startPoint + m)) {
                    left += 1
                    sectionsLeft -= 1
                }
            } else {
                while (right >= 0 && section[right] > (startPoint - m)) {
                    right -= 1
                    sectionsLeft -= 1
                }
            }
            
            paints += 1
        }
        
        return paints
    }
}