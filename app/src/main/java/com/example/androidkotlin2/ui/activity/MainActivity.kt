package com.example.androidkotlin2.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androidkotlin2.mvp.presenter.MainPresenter
import com.example.androidkotlin2.mvp.view.MainView
import com.example.androidkotlin2.ui.activity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private var vb: ActivityMainBinding? = null

    val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb?.root)

        val listener = View.OnClickListener {
            presenter.counterClick(it.id)
        }

        vb?.btnCounter1?.setOnClickListener(listener)
        vb?.btnCounter2?.setOnClickListener(listener)
        vb?.btnCounter3?.setOnClickListener(listener)
    }

    override fun setButtonText(index: Int, text: String) {
        when (index) {
            R.id.btn_counter1 -> vb?.btnCounter1?.text = text
            R.id.btn_counter2 -> vb?.btnCounter2?.text = text
            R.id.btn_counter3 -> vb?.btnCounter3?.text = text
        }
    }

    override fun getCurrentIndexArray(index: Int): Int {
        return when (index) {
            R.id.btn_counter1 -> {
                0
            }
            R.id.btn_counter2 -> {
                1
            }
            R.id.btn_counter3 -> {
                2
            }
            else -> -1
        }
    }
}