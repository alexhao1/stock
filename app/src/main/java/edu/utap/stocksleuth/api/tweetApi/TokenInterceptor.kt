package edu.utap.stocksleuth.api.tweetApi

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException


class TokenInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {

        //rewrite the request to add bearer token
        val newRequest: Request = chain.request().newBuilder()
            .header("Authorization", "Bearer " + "AAAAAAAAAAAAAAAAAAAAAIDIawEAAAAAkV%2F6PE65BSvLSPfo9lyLDN7TSVM%3DMOrCKNV3DWSYutU5ZzvDucpP0aX9tSwY1jT45FKtB01P8PJeJJ")
            .build()
        return chain.proceed(newRequest)
    }
}