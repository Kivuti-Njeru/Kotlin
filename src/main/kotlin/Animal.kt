abstract class Animal(
    name: String,
) {
    init {
        println("Hello my name is $name")
    }

    abstract fun makeSound()
}