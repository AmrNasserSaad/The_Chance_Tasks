
/**
 * IMPORTANT NOTE : These test cases for dynamic n*n grid size not just 3*3 , so that minimize the number of test cases
 */
fun main() {

    // region true test cases
    check(
        name = "when have an array with not duplicate in same (subgroup or row or col) it should return true  ",
        result = sudokuChecker(
            arrayOf(
                charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = true
    )

    check(
        name = "when have an array with not duplicate in same (subgroup or row or col) and have empty cells it should return true  ",
        result = sudokuChecker(
            arrayOf(
                charArrayOf('5', '3', '-', '-', '7', '-', '-', '-', '-'),
                charArrayOf('6', '-', '-', '1', '9', '5', '-', '-', '-'),
                charArrayOf('-', '9', '8', '-', '-', '-', '-', '6', '-'),
                charArrayOf('8', '-', '-', '-', '6', '-', '-', '-', '3'),
                charArrayOf('4', '-', '-', '8', '-', '3', '-', '-', '1'),
                charArrayOf('7', '-', '-', '-', '2', '-', '-', '-', '6'),
                charArrayOf('-', '6', '-', '-', '-', '-', '2', '8', '-'),
                charArrayOf('-', '-', '-', '4', '1', '9', '-', '-', '5'),
                charArrayOf('-', '-', '-', '-', '8', '-', '-', '7', '9')
            )
        ),
        correctResult = true
    )

    check(
        name = "when have an array that all cells are empty it should return true ",
        result = sudokuChecker(
            arrayOf(
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-'),
                charArrayOf('-', '-', '-', '-', '-', '-', '-', '-', '-')
            )
        ), correctResult = true
    )
    // endregion

    // region false test cases

    check(
        name = "when have an array with duplicate in same ( row )  it should return false",
        result =  sudokuChecker(
            arrayOf(
                charArrayOf('5', '5', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = false
    )

    check(
        name = "when have an array with duplicate in same ( col ) it should return false",
        result = sudokuChecker(
            arrayOf(
                charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('5', '7', '2', '1', '9', '5', '3', '4', '8'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = false
    )

    check(
        name = "when have an array with duplicate in same ( subgroup ) it should return false",
        result = sudokuChecker(
            arrayOf(
                charArrayOf('5', '3', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('6', '5', '2', '1', '9', '5', '3', '4', '8'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '9')
            )
        ),
        correctResult = false
    )



    check(
        name = "when have an array with ( zeros ) or ( negative ) it should return false",
        result = sudokuChecker(
            arrayOf(
                charArrayOf('0', '3', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('6', '7', '2', '1', '9', '5', '3', '4', '8'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('8', '5', '9', '7', '6', '1', '4', '2', '3'),
                charArrayOf('4', '2', '6', '8', '5', '3', '7', '9', '1'),
                charArrayOf('7', '1', '3', '9', '2', '4', '8', '5', '6'),
                charArrayOf('9', '6', '1', '5', '3', '7', '2', '8', '4'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8', '6', '1', '7', '5')
            )
        ),
        correctResult = false
    )
   check(
        name = "when have an array with ( n * m ) size  it should return false",
        result = sudokuChecker(
            arrayOf(
                charArrayOf('0', '3', '4', '6', '7', '8', '9', '1', '2'),
                charArrayOf('6', '7', '2', '1', '9'),
                charArrayOf('1', '9', '8', '3', '4', '2', '5', '6', '7'),
                charArrayOf('4', '2', '6', '8', '5'),
                charArrayOf('2', '8', '7', '4', '1', '9', '6', '3', '5'),
                charArrayOf('3', '4', '5', '2', '8')
            )
        ),
        correctResult = false
    )


    // endregion

}

private fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}