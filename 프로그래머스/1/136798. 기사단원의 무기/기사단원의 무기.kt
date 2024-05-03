class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var weaponPower = IntArray (number + 1) { 1 }
        var steelWeight = 0
        
        weaponPower[0] = 0
        for (i in 2..number)
            for (j in i..number step i) weaponPower[j] += 1
            
        for (i in weaponPower) steelWeight += if (i > limit) power else i
        
        return steelWeight
    }
}