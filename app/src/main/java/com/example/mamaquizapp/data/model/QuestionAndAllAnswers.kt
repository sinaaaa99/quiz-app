package com.example.mamaquizapp.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class QuestionAndAllAnswers(
    @Embedded var question: Questions,
    @Relation(
        parentColumn = "question_id",
        entityColumn = "question_id"
    ) var answers: List<Answers>
)