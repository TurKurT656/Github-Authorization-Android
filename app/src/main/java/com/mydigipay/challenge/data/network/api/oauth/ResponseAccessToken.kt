package com.mydigipay.challenge.data.network.api.oauth

import com.google.gson.annotations.SerializedName

data class ResponseAccessToken(
    @SerializedName("access_token")
    var accessToken: String,

    @SerializedName("token_type")
    var tokenType: String
)