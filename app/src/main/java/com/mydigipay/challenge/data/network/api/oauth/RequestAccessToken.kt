package com.mydigipay.challenge.data.network.api.oauth

import com.google.gson.annotations.SerializedName

data class RequestAccessToken(
    @SerializedName("client_id")
    var clientId: String,

    @SerializedName("client_secret")
    var clientSecret: String,

    @SerializedName("code")
    var code: String,

    @SerializedName("redirect_uri")
    var redirectUri: String,

    @SerializedName("state")
    var state: String
)