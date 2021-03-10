package com.example.androidkotlin2.mvp.presenter

import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter
import com.example.androidkotlin2.mvp.navigation.IScreens
import com.example.androidkotlin2.mvp.view.MainView

class MainPresenter(val router: Router, val screens: IScreens) : MvpPresenter<MainView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        router.replaceScreen(screens.users())
    }

    fun backClicked() {
        router.exit()
    }

}