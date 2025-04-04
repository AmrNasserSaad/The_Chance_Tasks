/**
 * Sudoku Checker Task
 *
 * Task Instructions:
 *
 * After completing the instructional videos, implement a Sudoku checker function that determines whether a given Sudoku puzzle is valid or not. A valid Sudoku must not contain any repeated numbers in the same row, column, or 3x3 subgrid (box). Use the character '-' to represent empty cells within the puzzle.
 *
 * - The function should return a Boolean value only—true if the Sudoku is valid, and false otherwise.
 *
 * - You must follow a Test-Driven Development (TDD) approach while building this function:
 *
 * - Create a check function, as demonstrated in the tutorial, and write all necessary tests first without implementing any logic inside the actual Sudoku checker function. Initially, the function should always return false.
 * Present your written test cases to your mentor during the daily meeting.
 * Once your mentor approves the test cases, proceed to implement the logic in the function incrementally until all test cases pass successfully.
 * After completing the implementation, design a full flowchart representing the logic of the function using draw.io.
 *
 * Extra: you can make the function dynamic and accept different size of the game like 4 * 4 or 16 * 16 not only 3 * 3
 *
 */

fun sudokuChecker(board: Array<CharArray>): Boolean {


    for (row in board) {
        if (hasDuplicates(row)) return false
    }


    for (col in 0..< 9) {
        val column = CharArray(9) { row -> board[row][col] }
        if (hasDuplicates(column)) return false
    }



    for (boxRow in 0..< 3) {
        for (boxCol in 0..< 3) {
            val subgrid = CharArray(9) { index ->
                val row = boxRow * 3 + index / 3
                val col = boxCol * 3 + index % 3
                board[row][col]
            }
            if (hasDuplicates(subgrid)) return false
        }
    }

    return true
}

private fun hasDuplicates(cells: CharArray): Boolean {
    val seen = mutableSetOf<Char>()
    for (cell in cells) {
        if (cell == '-') continue
        if (!cell.isDigit() || cell == '0') return true
        if (cell in seen) return true
        seen.add(cell)
    }
    return false
}