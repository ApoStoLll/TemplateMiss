package com.jevely.wildsevens.di

import android.content.Context
import androidx.room.Room
import com.jevely.wildsevens.datasource.Local
import com.jevely.wildsevens.datasource.ScoreDB
import com.jevely.wildsevens.repository.IScoreRepository
import com.jevely.wildsevens.repository.ScoreRepository
import org.koin.dsl.module

val dataSourceModule = module{
    single {
        provideDatabase(get())
    }
    single {
        provideLocal(get())
    }
    single {
        provideRepository(get())
    }

}

fun provideLocal(ScoreDB: ScoreDB) : Local{
    return Local(ScoreDB)
}

fun provideRepository(local: Local): IScoreRepository {
    return ScoreRepository(local)
}

fun provideDatabase(context: Context) : ScoreDB {
    return Room.databaseBuilder(context, ScoreDB::class.java, "db")
        .fallbackToDestructiveMigration()
        .build()
}