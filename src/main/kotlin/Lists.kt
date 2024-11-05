fun main(){
    val shoppingList = mutableListOf("Lamborghini", "Penthouse","Rolex")
    shoppingList.add("Mercedes")

//  ========== LOOPS ========

    for (shoppingItem in shoppingList){
        println(shoppingItem)
    }

    for(i in 1..100){
         println(i)
    }
}