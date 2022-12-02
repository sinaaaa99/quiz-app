package com.example.mamaquizapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "suggestionType1")
class SuggestionType1(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var type: String,
    var title: String,
    var subTitle: String,
    var answer: String
)

@Entity(tableName = "suggestionType2")
class SuggestionType2(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var type: String,
    var title: String,
    var subTitle: String,
    var answer: String
)

@Entity(tableName = "suggestionType3")
class SuggestionType3(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var type: String,
    var title: String,
    var subTitle: String,
    var answer: String
)

@Entity(tableName = "suggestionType4")
class SuggestionType4(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var type: String,
    var title: String,
    var subTitle: String,
    var answer: String
)

@Entity(tableName = "suggestionType5")
class SuggestionType5(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var type: String,
    var title: String,
    var subTitle: String,
    var answer: String
)

@Entity(tableName = "suggestionType6")
class SuggestionType6(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var type: String,
    var title: String,
    var subTitle: String,
    var answer: String
)