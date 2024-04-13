import java.util.Scanner

fun main()
{
    val rcv = Scanner(System.`in`)
    var duration: Int = 0
    var totalDuration: Int = 0
    
    for(i in 0..3)
    {
        duration = rcv.nextInt()
        totalDuration += duration
    }
    
    println("${totalDuration / 60}")
    println("${totalDuration % 60}")
}