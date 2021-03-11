package com.example.androidkotlin2.mvp.presenter

import com.example.androidkotlin2.mvp.view.UserView
import com.github.terrakok.cicerone.Router
import moxy.MvpPresenter

class UserPresenter(val router: Router) : MvpPresenter<UserView>() {

    fun setLoginUser(login: String) {
        viewState.setLoginUser(login)
    }

    fun backClick(): Boolean {
        router.exit()
        return true
    }
}