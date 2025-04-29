package tde4

class CharGenerator(val char: CharRange = ('a' .. 'z')) {
    fun showRange(){
        println(char.random())
    }
}