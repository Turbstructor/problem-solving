class Solution {
    fun gcd(a: Int, b: Int): Int {
        if (a == b) return a
        else if (a > b) return (if (a % b == 0) b else gcd(b, (a % b)))
        else return (if (b % a == 0) a else gcd(a, (b % a)))
    }
    fun solution(arr: IntArray): Int {
        var answer = 1
        
        for (each in arr)
            answer = (answer * each) / gcd(answer, each)
        
        return answer
    }
}