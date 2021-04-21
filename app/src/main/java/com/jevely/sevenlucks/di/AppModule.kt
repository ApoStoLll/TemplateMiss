package com.jevely.sevenlucks.di

import com.jevely.sevenlucks.ui.game.GameViewModel
import com.jevely.sevenlucks.ui.one.OneViewModel
import com.jevely.sevenlucks.ui.result.ResultViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        GameViewModel(get())
    }
    viewModel {
        OneViewModel(get())
    }
    viewModel {
        ResultViewModel(get())
    }

}