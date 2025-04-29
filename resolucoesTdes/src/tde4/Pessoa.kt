package tde4

class Pessoa(val name: String, val age: Int) {
    fun walk(){
        println("$name caminhando")
    }

    fun speak(){
        println("$name falando")
    }
}