package com.example.mycontact.domain.model

import com.example.mycontact.database.TagDbModel


data class TagModel(
    val id: Long,
    val name: String,
    val hex: String
) {
    companion object {
        val DEFAULT = with(TagDbModel.DEFAULT_TAG) { TagModel(id, name, hex) }
    }
}
