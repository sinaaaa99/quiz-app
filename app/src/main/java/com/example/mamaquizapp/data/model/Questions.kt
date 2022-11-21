package com.example.mamaquizapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(tableName = "questions", indices = [Index("question_id")])
data class Questions(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "question_id")
    var id: Int,
    var questionText: String,
    var questionType: Int,
    var answerState: Boolean,
    var isLast:Boolean,
    var isAnswered: Boolean,
    var answerText:String
)