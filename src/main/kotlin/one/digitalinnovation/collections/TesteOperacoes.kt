package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios)
        println(salario)

    // max, min and average
    println("-------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    // filters
    println("-------------------------")
    val salariosMaiorQue2500 = salarios.filter { it > 2500 }
    salariosMaiorQue2500.forEach { println(it) }

    // counter
    println("-------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    // search
    println("-------------------------")
    println(salarios.find { it == 2250.0 })

    // any
    println("-------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })


}