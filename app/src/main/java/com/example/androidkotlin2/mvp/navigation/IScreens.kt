package com.example.androidkotlin2.mvp.navigation

import com.example.androidkotlin2.mvp.model.entity.GithubUser
import com.example.androidkotlin2.mvp.presenter.list.IUsersListPresenter
import com.github.terrakok.cicerone.Screen

interface IScreens {
    fun users(): Screen
    fun user(user: GithubUser): Screen
}