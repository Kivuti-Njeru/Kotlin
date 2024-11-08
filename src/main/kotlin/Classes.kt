fun main(){
    println()
    val dog = Dog()
    dog.makeSound()

    println()
    val cat = Cat()
    cat.makeSound()

//    ANONYMOUS CLASSES
    println()
    println("Anonymous class bear".uppercase())
    val bear = object : Animal("Mr Bear Man"){
        override fun makeSound() {
            println("ROOOARRR!!!!")
        }
    }
    bear.makeSound()
}
