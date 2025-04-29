import tde5.repeatingListTreatment

fun main() {

//    println("Exercício 1")
//    val char = CharGenerator()
//    char.showRange()
//    println("----------------------")
//
//    println("Exercício 2")
//    val person = Pessoa("Caetano", 21)
//    person.walk()
//    person.speak()
//    println("----------------------")
//
//    println("Exercício 3")
//    showResult(
//        tde4.Result.Loading()
//    )

//    println("Exercício 1")
//    val listNumber: List<Int> = mutableListOf(5, 5)
//    println(
//        calculateAvarage(
//            listNumber
//        ) {
//          lista, tamanho ->
//            var total = 0
//            total = lista.average().toInt()
//            total
//        }
//    )
//
//    println("Exercício 2")
//
//    val numbers: List<Int> = mutableListOf(1, 5, 6, 8, 90, 45, 3, 2, 33, 56, 7344, 6)
//
//    listEveNumber(numbers)

    println("Exercício 3")

    val listNumber2 = listOf(1, 3, 4.5, 99, 154, 157, 307, 2009, 1, 5, 9, 97, 23, 345, 44, 6, 2.2, 3, 99 ,99, 154, 4.5, 44, 6, 6)

    println(repeatingListTreatment(listNumber2))

}