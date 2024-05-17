class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var nameByRank = players.copyOf()
        var rankByName: MutableMap<String, Int> = mutableMapOf()
        var targetRank: Int
        var precededOne: String
        for (i in nameByRank.indices) rankByName.put(nameByRank[i], i)
        
        for (calling in callings) {
            targetRank = rankByName[calling]!!
            precededOne = nameByRank[targetRank - 1]
            
            rankByName[precededOne] = rankByName[calling]!!.also { rankByName[calling] = rankByName[precededOne]!! }
            nameByRank[targetRank] = nameByRank[targetRank - 1].also { nameByRank[targetRank - 1] = nameByRank[targetRank] }
        }
        
        return nameByRank
    }
}