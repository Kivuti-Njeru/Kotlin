fun main(){
    val x = isEven(5)
    println(x)

    val y = 3
    println(y.isOdd())
}

fun Int.isOdd(): Boolean{
    return this % 2 == 1
}

fun isEven(number: Int): Boolean{
    return number % 2 == 0
}

fun print10Numbers(){
     for(i in 1..10){
         println(i)
     }
}