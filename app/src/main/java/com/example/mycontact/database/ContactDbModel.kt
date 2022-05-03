package com.example.mycontact.database



import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ContactDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "numphone") val numphone: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "tag_id") val tagId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,
    @ColumnInfo(name = "is_colsefriend") val isColsefriend: Boolean,




    ) {
    companion object {
        val DEFAULT_CONTACTS = listOf(
            ContactDbModel(1, "Yoru", "11111555", false, false, 1, false,false),
            ContactDbModel(2, "Brim Stone", "222245645654", false, false, 2, false,false),
            ContactDbModel(3, "Jett revme", "08194564321654", false, false, 3, false,false),
            ContactDbModel(
                4,
                "Sova the Hunter",
                "456456213",
                false,
                false,
                4,
                false,
                false
            ),

            )
    }
}