fun main(){
    val x = 0
    if(x == 2) {
        println("x is 2")
    } else if (x == 3){
        println("x is 3")
    } else {
        println("x is not 2 or 3")
    }

    val y = if (x == 2) 2 else 3*5
    println("x is $y")

//     WHEN EXPRESSION

    when(x){
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 to 10")
        else -> println("x is not in the range of 1 to 10")
    }
}