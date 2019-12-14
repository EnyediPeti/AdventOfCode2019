import kotlin.random.Random

fun main() {
    while (intProgram[0] != FIX_RESULT) {
        runProgram()
    }
}

private fun runProgram() {
    intProgram = mutableListOf(1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 10, 19, 23, 1, 23, 9, 27, 1, 5, 27, 31, 2, 31, 13, 35, 1, 35, 5, 39, 1, 39, 5, 43, 2, 13, 43, 47, 2, 47, 10, 51, 1, 51, 6, 55, 2, 55, 9, 59, 1, 59, 5, 63, 1, 63, 13, 67, 2, 67, 6, 71, 1, 71, 5, 75, 1, 75, 5, 79, 1, 79, 9, 83, 1, 10, 83, 87, 1, 87, 10, 91, 1, 91, 9, 95, 1, 10, 95, 99, 1, 10, 99, 103, 2, 103, 10, 107, 1, 107, 9, 111, 2, 6, 111, 115, 1, 5, 115, 119, 2, 119, 13, 123, 1, 6, 123, 127, 2, 9, 127, 131, 1, 131, 5, 135, 1, 135, 13, 139, 1, 139, 10, 143, 1, 2, 143, 147, 1, 147, 10, 0, 99, 2, 0, 14, 0)
    //random trying
    pos1 = (Math.random() * 99).toInt() //Random(System.currentTimeMillis()).nextInt(0, 99)
    pos2 = (Math.random() * 99).toInt() //Random(System.currentTimeMillis()).nextInt(0, 99)

    intProgram[1] = pos1
    intProgram[2] = pos2

    for (index in intProgram.indices step 4) {
        if (index % 4 == 0) {
            when (intProgram[index]) {
                1 -> addValues(intProgram[index + 1], intProgram[index + 2], intProgram[index + 3])
                2 -> multipleValues(intProgram[index + 1], intProgram[index + 2], intProgram[index + 3])
                99 -> stopProgram()
            }
        }
    }
}

fun stopProgram() {
    if (intProgram[0] == FIX_RESULT) {
        println(intProgram[1])
        println(intProgram[2])
    } /*else {
        resetList()
    }*/
}

fun resetList() {
    //intProgram.clear()
    //intProgram.addAll(originalList)
    /*if (pos1 < 99) {
        pos1 += 1
    } else {
        pos1 = 0
        pos2 += 1
    }*/

    //random trying
    pos1 = (Math.random() * 99).toInt() //Random(System.currentTimeMillis()).nextInt(0, 99)
    pos2 = (Math.random() * 99).toInt() //Random(System.currentTimeMillis()).nextInt(0, 99)

    intProgram[1] = pos1
    intProgram[2] = pos2
    runProgram()
}

fun multipleValues(num1: Int, num2: Int, multiPos: Int) {
    intProgram[multiPos] = intProgram[num1] * intProgram[num2]
}

fun addValues(num1: Int, num2: Int, sumPos: Int) {
    intProgram[sumPos] = intProgram[num1] + intProgram[num2]
}

const val FIX_RESULT = 19690720

var pos1: Int = 0
var pos2: Int = 0

val originalList = mutableListOf(1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 10, 19, 23, 1, 23, 9, 27, 1, 5, 27, 31, 2, 31, 13, 35, 1, 35, 5, 39, 1, 39, 5, 43, 2, 13, 43, 47, 2, 47, 10, 51, 1, 51, 6, 55, 2, 55, 9, 59, 1, 59, 5, 63, 1, 63, 13, 67, 2, 67, 6, 71, 1, 71, 5, 75, 1, 75, 5, 79, 1, 79, 9, 83, 1, 10, 83, 87, 1, 87, 10, 91, 1, 91, 9, 95, 1, 10, 95, 99, 1, 10, 99, 103, 2, 103, 10, 107, 1, 107, 9, 111, 2, 6, 111, 115, 1, 5, 115, 119, 2, 119, 13, 123, 1, 6, 123, 127, 2, 9, 127, 131, 1, 131, 5, 135, 1, 135, 13, 139, 1, 139, 10, 143, 1, 2, 143, 147, 1, 147, 10, 0, 99, 2, 0, 14, 0)

var intProgram = mutableListOf(1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 10, 19, 23, 1, 23, 9, 27, 1, 5, 27, 31, 2, 31, 13, 35, 1, 35, 5, 39, 1, 39, 5, 43, 2, 13, 43, 47, 2, 47, 10, 51, 1, 51, 6, 55, 2, 55, 9, 59, 1, 59, 5, 63, 1, 63, 13, 67, 2, 67, 6, 71, 1, 71, 5, 75, 1, 75, 5, 79, 1, 79, 9, 83, 1, 10, 83, 87, 1, 87, 10, 91, 1, 91, 9, 95, 1, 10, 95, 99, 1, 10, 99, 103, 2, 103, 10, 107, 1, 107, 9, 111, 2, 6, 111, 115, 1, 5, 115, 119, 2, 119, 13, 123, 1, 6, 123, 127, 2, 9, 127, 131, 1, 131, 5, 135, 1, 135, 13, 139, 1, 139, 10, 143, 1, 2, 143, 147, 1, 147, 10, 0, 99, 2, 0, 14, 0)