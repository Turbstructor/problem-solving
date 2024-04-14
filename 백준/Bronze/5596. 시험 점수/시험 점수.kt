import java.util.Scanner

fun main()
{
    val reader = Scanner(System.`in`)
    var score: Int = 0
    var total: Int = 0
    var max: Int = -1
    
    for(j in 0..1)
    {
        total = 0
        for(i in 0..3)
        {
            score = reader.nextInt()
            total += score
        }
        
        if(max < total) max = total
    }
    
    println("$max")
}