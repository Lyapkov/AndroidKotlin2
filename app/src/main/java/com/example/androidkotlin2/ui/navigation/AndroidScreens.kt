package com.example.androidkotlin2.ui.navigation

import com.github.terrakok.cicerone.androidx.FragmentScreen
import com.example.androidkotlin2.mvp.navigation.IScreens
import com.example.androidkotlin2.ui.fragment.UsersFragment

class AndroidScreens : IScreens {
    override fun users() = FragmentScreen { UsersFragment.newInstance() }
}