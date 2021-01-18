import kotlin.math.*


fun main() {

    var a =  readLine()!!.toDouble()

    var b =  readLine()!!.toDouble()

    var g = a * a + b * b

    var c = sqrt(g.toDouble())

    var p = a + b + c

    println(c)
    println(p)

    
}