package com.example.androidkotlin2.ui.navigation

import com.example.androidkotlin2.mvp.model.entity.GithubUser
import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.example.androidkotlin2.mvp.navigation.IScreens
import com.example.androidkotlin2.mvp.presenter.list.IUsersListPresenter
import com.example.androidkotlin2.ui.activity.UserFragment
import com.example.androidkotlin2.ui.fragment.UsersFragment

class AndroidScreens : IScreens {
    override fun users() = FragmentScreen { UsersFragment.newInstance() }
}