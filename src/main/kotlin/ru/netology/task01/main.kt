package ru.netology.task01

fun main() {
    println("Введите сумму перевода (минимальная комиссия 35 руб.): ")
    val amount = readln().toDouble()
    val commission = amount * .75 / 100
    println(
        if (amount < 35) "Сумма перевода ниже минимума"
        else if (commission < 35) "Комиссия составит 35 руб."
        else "Комиссия составит ${String.format("%.2f", commission)} руб."
    )
}