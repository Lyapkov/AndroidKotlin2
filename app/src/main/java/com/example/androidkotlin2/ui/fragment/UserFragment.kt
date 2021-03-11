package com.example.androidkotlin2.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.androidkotlin2.mvp.model.entity.GithubUser
import com.example.androidkotlin2.mvp.presenter.UserPresenter
import com.example.androidkotlin2.mvp.view.UserView
import com.example.androidkotlin2.ui.App
import com.example.androidkotlin2.ui.BackClickListener
import com.example.androidkotlin2.ui.activity.databinding.FragmentUserBinding
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

private const val USER = "user"

class UserFragment : MvpAppCompatFragment(), UserView, BackClickListener {

    private var login: String = ""

    companion object {
        @JvmStatic
        fun newInstance(user: GithubUser) =
            UserFragment().apply {
                arguments = Bundle().apply {
                    putString(USER, user.login)
                }
            }
    }

    private val presenter by moxyPresenter {
        UserPresenter(App.instance.router)
    }

    private var vb: FragmentUserBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            login = it.getString(USER).toString()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentUserBinding.inflate(inflater, container, false).also {
        vb = it
        presenter.setLoginUser(login)
    }.root

    override fun setLoginUser(login: String) {
        vb?.user?.text = login
    }

    override fun backPressed() = presenter.backClick()
}