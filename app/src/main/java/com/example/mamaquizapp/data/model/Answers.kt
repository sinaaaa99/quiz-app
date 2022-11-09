package com.example.mamaquizapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(
    tableName = "answers", indices = [Index("question_id")], foreignKeys = [
        ForeignKey(
            entity = Questions::class,
            parentColumns = ["question_id"],
            childColumns = ["question_id"],
            onDelete = CASCADE
        )
    ]
)
class Answers(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "answer_id")
    var id: Int,
    @ColumnInfo(name = "question_id")
    var questionId: Int,
    var isCorrect: Boolean,
    var answerText: String
)