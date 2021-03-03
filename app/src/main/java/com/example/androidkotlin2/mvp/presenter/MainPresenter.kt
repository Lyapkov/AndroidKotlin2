package com.example.androidkotlin2.mvp.presenter

import com.example.androidkotlin2.mvp.model.CountersModel
import com.example.androidkotlin2.mvp.view.MainView

class MainPresenter(val mainView: MainView) {
    val model = CountersModel()

    fun counterClick(id: Int) {
        val nextValue = model.next(mainView.getCurrentIndexArray(id))
        mainView.setButtonText(id, nextValue.toString())
    }
}