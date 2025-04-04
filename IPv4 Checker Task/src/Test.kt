fun main() {


    // region true test cases
    check(
        name = "when have a string contains of four numeric segments, separated by three dots (.) ,  it should return true  ",
        result = ipv4Checker(address = "198.162.1.1"),
        correctResult = true
    )

    // endregion


    // region false test cases


    check(
        name = "when have a string contains of number of segments does not equal 4 , it should return false",
        result = ipv4Checker(address = "198.162.1"),
        correctResult = false
    )

    check(
        name = "when have a string contains of number of dots does not equal 3 , it should return false",
        result = ipv4Checker(address = "198.162.1.2.3"),
        correctResult = false
    )

    check(
        name = "when the segment contains a number is not between 0 and 255 range , it should return false",
        result = ipv4Checker(address = "500.600.700.800"),
        correctResult = false
    )

    check(
        name = "when the segment contains a non numeric input , it should return false",
        result = ipv4Checker(address = "a.n.s.a"),
        correctResult = false
    )

    check(
        name = "when the segment contains a two digits or more and starting with a zero , it should return false",
        result = ipv4Checker(address = "01.162.1.2"),
        correctResult = false
    )

    check(
        name = "when a string is empty or blank , it should return false",
        result = ipv4Checker(address = ""),
        correctResult = false
    )

    check(
        name = "when the segment contains a negative number , it should return false",
        result = ipv4Checker(address = "-198.162.1.2"),
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
