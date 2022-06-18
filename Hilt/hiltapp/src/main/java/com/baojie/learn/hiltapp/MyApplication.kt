package com.baojie.learn.hiltapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/18 08:13
 */
@HiltAndroidApp
class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()

    }
}