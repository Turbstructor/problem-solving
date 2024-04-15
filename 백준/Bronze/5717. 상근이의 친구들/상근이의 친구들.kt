import java.util.Scanner

fun main()
{
    var reader = Scanner(System.`in`)
    var m: Int = 0
    var f: Int = 0
    
    while(true)
    {
        m = reader.nextInt()
        f = reader.nextInt()
        
        if(m == 0 && f == 0) break
        
        println("${m + f}")
    }
}