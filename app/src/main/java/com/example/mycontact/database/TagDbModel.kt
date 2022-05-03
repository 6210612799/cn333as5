package com.example.mycontact.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TagDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_TAGS = listOf(
            TagDbModel(1, "#FF0000","Friend"),
            TagDbModel(2, "#21618C","Work"),
            TagDbModel(3, "#8E44AD","School"),
            TagDbModel(4, "#0729FF","Family"),
            TagDbModel(5, "#FF07A1","Babe"),

            )
        val DEFAULT_TAG = DEFAULT_TAGS[0]
    }
}