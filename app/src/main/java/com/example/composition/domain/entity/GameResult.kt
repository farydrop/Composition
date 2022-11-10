package com.example.composition.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean,    //значение победили мы или нет
    val countOrRightAnswers: Int,    //кол-во правильных ответов
    val countOfQuestions: Int,    //общее кол-во вопросов, на которые ответил пользователь
    val gameSettings: GameSettings    //настройки игры
) :Serializable