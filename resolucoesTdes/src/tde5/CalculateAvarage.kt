package tde5

fun calculateAvarage(n1: List<Int>, average: (List<Int>, Int) -> Int): Int{
    return average(n1, n1.size)
}

