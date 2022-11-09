package edu.utap.stocksleuth.api.tweetApi

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException


class CongressTokenInterceptor : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {

        //rewrite the request to add bearer token
        val newRequest: Request = chain.request().newBuilder()
            .header("Authorization", "Token " + "c37d8aa804deecca4426dc730b830329c8c4dcc3")
            .build()
        return chain.proceed(newRequest)
    }
}