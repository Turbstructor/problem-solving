class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var robot = intArrayOf(-1, -1)
        var robotFuture = IntArray(2)
        var op: Char
        var n: Int
        var parts: List<String>
        var isValid: Boolean
        
        for (i in park.indices) {
            for (j in park[i].indices) {
                if (park[i][j] == 'S'){ robot[0] = i; robot[1] = j; break }   
            }
            
            if (robot[0] != -1) break
        }
        
        for (each in routes) {
            isValid = true
            parts = each.split(" ")
            op = parts[0].first()
            n = parts[1].toInt()
            robotFuture = robot.copyOf()
            
            for (i in 1..n) {
                if (op in "NS") robotFuture[0] += (1 * (if (op == 'N') -1 else 1))
                else robotFuture[1] += (1 * (if (op == 'W') -1 else 1))
                
                if ((robotFuture[0] !in 0..(park.size - 1)) || (robotFuture[1] !in 0..(park[0].length - 1))) isValid = false
                else if (park[robotFuture[0]][robotFuture[1]] == 'X') isValid = false
                    
                if(!isValid) break
            }
            
            if (isValid) robot = robotFuture.copyOf()
        }
        
        return robot
    }
}