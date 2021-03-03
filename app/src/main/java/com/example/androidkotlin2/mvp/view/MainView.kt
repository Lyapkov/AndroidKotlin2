package com.example.androidkotlin2.mvp.view

interface MainView {
    fun setButtonText(index: Int, text: String)
    fun getCurrentIndexArray(index: Int): Int
}