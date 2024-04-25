class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)
        
        commands.forEachIndexed{ index, command -> run {
               answer[index] = array.slice((command[0] - 1)..(command[1] - 1)).sorted().get(command[2] - 1)
        }}
        
        return answer
    }
}