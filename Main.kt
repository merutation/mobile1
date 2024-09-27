

//Exercise 2
open class Person(
    var name: String,
    var age: Int,
    var email: String
) {
    open fun displayInfo() {
        println("name: $name")
        println("age: $age")
        println("email: $email")
    }
}

class Employee(
    name: String,
    age: Int,
    email: String,
    var salary: Double
) : Person(name, age, email) {
    override fun displayInfo() {
        super.displayInfo()
        println("salary: $salary")
    }
}

class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("deposit: $$amount")
        } else {
            println("deposit amount must be positive")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount
                println("withdrew: $$amount")
            } else {
                println("Not enough money")
            }
        } else {
            println("withdrawal must be positive")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

//Exercise 3
// 1
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 2 lambda
val multiply: (Int, Int) -> Int = { x, y -> x * y }

// 3 higher order
fun higherOrder(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}



fun main(args: Array<String>) {
    //Exercise 1
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


    //Exercise 2
    val person = Person("Meru",20, "meru@gmail.com")
    person.displayInfo()
 
    println()

    val employee = Employee("Ansar",21,"ansar@gmail.com",10000.0)
    employee.displayInfo()
 
    println()

    val bankAccount = BankAccount()
    bankAccount.deposit(500.0)
    bankAccount.withdraw(200.0)
    println("current balance: $${bankAccount.getBalance()}")


    //Exercise 3
    val resSum = sum(1,2)
    println("sum: $resultSum")

    val resMultiply = multiply(3,2)
    println("multiplication: $resultMultiply")

    val resOperation = applyOperation(4,5,multiply)
    println("higher-order function : $resultOperation")

}


 
