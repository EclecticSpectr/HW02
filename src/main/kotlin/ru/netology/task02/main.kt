package ru.netology.task02

fun main() {
    println("Количество лайков: ")
    val likes = readln().toInt()
    val selection = if (likes % 10 == 1 && likes % 100 != 11 && likes % 1000 != 111) "человеку" else "людям"
    println("Понравилось $likes $selection")
}