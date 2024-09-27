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

fun main() {
    val person = Person("Meru", 20, "meru@gmail.com")
    person.displayInfo()
    
    println()

    val employee = Employee("Ansar", 21, "ansar@gmail.com", 10000.0)
    employee.displayInfo()
    
    println()

    val bankAccount = BankAccount()
    bankAccount.deposit(500.0)
    bankAccount.withdraw(200.0)
    println("Current Balance: $${bankAccount.getBalance()}")
}
