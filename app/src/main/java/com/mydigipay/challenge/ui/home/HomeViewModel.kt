package com.mydigipay.challenge.ui.home

import com.mydigipay.challenge.base.BaseViewModel
import com.mydigipay.challenge.data.repository.token.TokenRepository
import com.mydigipay.challenge.ui.repository.list.RepositoryListFragmentDirections
import com.mydigipay.challenge.util.ktx.launch

class HomeViewModel(
    private val tokenRepository: TokenRepository
) : BaseViewModel() {


    fun onProfileClicked() = launch {
        if (tokenRepository.isUserLoggedIn())
            navigateTo(RepositoryListFragmentDirections.actionRepositoriesToProfile())
        else
            navigateTo(RepositoryListFragmentDirections.actionRepositoriesToLogin())
    }

}