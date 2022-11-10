package com.example.composition.domain.entity

data class GameSettings (
    val maxSumValue: Int,                //максимально возможное значение
    val minCountOfRightAnswers: Int,     //минимальное кол-во правильных ответов для победы
    val minPercentOfRightAnswers: Int,   //минимальное процент правильных ответов
    val gameTimeInSeconds: Int           //время игры в секундах
)