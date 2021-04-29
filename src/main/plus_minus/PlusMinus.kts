fun main(args: Array<String>) {

    /** */

    val list = arrayListOf<Int>(-1, -2, 1, 2, 3)

    plusMinus(list)
}

/** */

fun plusMinus(arr: ArrayList<Int>): Unit {
    var positivo:Double  = 0.0
    var negativo:Double  = 0.0
    var neutro:Double  = 0.0
    for (value in arr) {
        if (value > 0) {
            positivo += 1
        } else if (value < 0) {
            negativo += 1
        } else {
            neutro += 1
        }
    }
    println(positivo / arr.size)
    println(negativo / arr.size)
    println(neutro / arr.size)
}