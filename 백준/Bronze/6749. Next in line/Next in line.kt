import java.util.Scanner

fun main()
{
    var reader: Scanner = Scanner(System.`in`)
    var y: Int = reader.nextInt()
    var m: Int = reader.nextInt()
    var o: Int = (m * 2 - y)
    
    println("${o}")
}