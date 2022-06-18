package com.baojie.learn.hiltapp

import android.app.Application
import com.baojie.learn.hiltapp.httpprocessor.annotation.BindOkhttp
import com.baojie.learn.hiltapp.httpprocessor.processor.IHttpProcessor
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/18 08:13
 */
@HiltAndroidApp
class MyApplication: Application() {

    @BindOkhttp
    @Inject
    private lateinit var httpProcessor: IHttpProcessor


    override fun onCreate() {
        super.onCreate()

    }

    fun getHttpProcessor(): IHttpProcessor {
        return httpProcessor
    }
}