package ru.netology.task03

fun main() {
    val isRegularCustomer = true

    println("Введите сумму покупки: ")
    val purchaseAmount = readln().toDouble()

    val discount = if (purchaseAmount in 1_001.0..10_000.0) {
        purchaseAmount - 100.0
    } else if (purchaseAmount > 10_000.0) {
        purchaseAmount * 5 / 100
    } else {
        0.0
    }

    val finalCost = if (!isRegularCustomer) {
        purchaseAmount - discount
    } else {
        purchaseAmount - discount - (purchaseAmount * 1 / 100)
    }
    
    println("Сумма покупки составит ${String.format("%.2f", finalCost)} руб.")
}