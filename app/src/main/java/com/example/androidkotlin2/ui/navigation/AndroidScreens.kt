package com.example.androidkotlin2.ui.navigation

import com.example.androidkotlin2.mvp.model.entity.GithubUser
import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.example.androidkotlin2.mvp.navigation.IScreens
import com.example.androidkotlin2.ui.fragment.UserFragment
import com.example.androidkotlin2.ui.fragment.UsersFragment

class AndroidScreens : IScreens {
    override fun users() = FragmentScreen { UsersFragment.newInstance() }
    override fun user(user: GithubUser) = FragmentScreen { UserFragment.newInstance(user) }
}