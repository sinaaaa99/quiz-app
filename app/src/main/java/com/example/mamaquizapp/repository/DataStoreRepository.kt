package com.example.mamaquizapp.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

const val PREFERENCE_NAME = "my_preference"

class DataStoreRepository(private val context: Context) {

    private object PreferenceKey {

        val name = booleanPreferencesKey("PreferenceKey")
    }


    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = PREFERENCE_NAME)


    suspend fun saveData() {

        context.dataStore.edit { preference ->

            preference[PreferenceKey.name] = true

        }
    }

    val readFromDataStore: Flow<Boolean> = context.dataStore.data
        .map { preference ->
            val isFinished = preference[PreferenceKey.name] ?: false
            isFinished
        }
}