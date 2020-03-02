package com.mydigipay.challenge.repository.oauth

import com.mydigipay.challenge.network.oauth.RequestAccessToken
import com.mydigipay.challenge.network.oauth.ResponseAccessToken

interface AccessTokenDataSource {
    suspend fun accessToken(requestAccessToken: RequestAccessToken): ResponseAccessToken
}