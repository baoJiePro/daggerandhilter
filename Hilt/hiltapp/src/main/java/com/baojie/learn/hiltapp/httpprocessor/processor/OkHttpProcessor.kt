package com.baojie.learn.hiltapp.httpprocessor.processor

import android.os.Handler
import okhttp3.OkHttpClient
import javax.inject.Inject

/**
 * @Description:
 * @Author baoJie
 * @Date 2022/6/18 17:29
 */
class OkHttpProcessor @Inject constructor() : IHttpProcessor {

    private var mHandler: Handler = Handler()
    private var mOkHttpClient: OkHttpClient = OkHttpClient.Builder().build()

    override fun post(url: String, params: Map<String, Any>, callback: ICallback) {

    }
}