package com.example.composition.domain.entity

data class Question (
    val sum: Int,              //значение суммы, которое отображается в кружке
    val visibleNumber: Int,    //видимое число,которое отображается в левом квадрате
    val options: List<Int>     //варианты ответов
) {
    val rightAnswer: Int
        get() = sum - visibleNumber
}