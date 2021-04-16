package com.jevely.wildsevens.di

import com.jevely.wildsevens.ui.game.GameViewModel
import com.jevely.wildsevens.ui.one.OneViewModel
import com.jevely.wildsevens.ui.result.ResultViewModel
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