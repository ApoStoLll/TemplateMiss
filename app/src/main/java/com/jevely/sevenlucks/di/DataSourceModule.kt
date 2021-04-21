package com.jevely.sevenlucks.di

import android.content.Context
import androidx.room.Room
import com.jevely.sevenlucks.datasource.Local
import com.jevely.sevenlucks.datasource.ScoreDB
import com.jevely.sevenlucks.repository.IScoreRepository
import com.jevely.sevenlucks.repository.ScoreRepository
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