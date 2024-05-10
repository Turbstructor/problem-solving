class Solution {
    fun solution(ingredient: IntArray): Int {
        var ingredientStack = IntArray(ingredient.size)
        var pt = 0
        
        val hamburgerSequence = intArrayOf(1, 2, 3, 1)
        var hamburgersMade = 0
        
        for (each in ingredient) {
            ingredientStack[pt] = each
                        
            if (pt >= 3 && ingredientStack.sliceArray((pt - 3)..pt).contentEquals(hamburgerSequence)) {
                hamburgersMade += 1
                pt -= 4
            }
            
            pt += 1
        }
        
        return hamburgersMade
    }
}