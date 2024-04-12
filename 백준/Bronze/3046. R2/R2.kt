import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    var r1: Int = reader.nextInt()
    var s: Int = reader.nextInt()
    
    val r2: Int = (s * 2 - r1)
    
    println("$r2")
}