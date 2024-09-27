//Exercise 1

fun main(args: Array<String>) {
    //1
    val valInt: Int = 1
    val valDouble: Double = 2.7
    val valString: String = "word"
    val valBoolean: Boolean = true
    
    println(valInt)
    println(valDouble)
    println(valString)
    println(valBoolean)
  
    //2
    if (valInt>0){
      println("It is positive")
    }
    else if (valInt<0){
      println("It is negative")
    }
    else {
      println("It is 0")
    }

    //3
    println("for loop:")
    for (i in 1..10) {
        println(i)
    }

    println("\n while loop:")
    var j = 1
    while (j <= 10) {
        println(j)
        j++
    }

    //4
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var sum = 0

    for (number in numbers) {
        sum += number
    }

    println("sum is: $sum")

}
