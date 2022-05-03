package com.example.mycontact.database

import android.content.Context
import androidx.room.*

@Database(entities = [ContactDbModel::class, TagDbModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactDao
    abstract fun tagDao(): TagDao

    companion object {
        private const val DATABASE_NAME = "contact-maker-database"
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            var instance = INSTANCE
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()

                INSTANCE = instance
            }

            return instance
        }
    }
}