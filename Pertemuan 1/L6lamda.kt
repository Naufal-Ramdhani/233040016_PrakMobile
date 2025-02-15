fun main() {
    val greet = { name: String -> greeting(name) }
    greet("kotlin")
}

fun greeting(name: String){
    println("halo $name!")
}