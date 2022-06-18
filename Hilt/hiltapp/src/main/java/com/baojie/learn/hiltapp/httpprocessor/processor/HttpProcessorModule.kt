package com.baojie.learn.hiltapp.httpprocessor.processor

import com.baojie.learn.hiltapp.httpprocessor.annotation.BindOkhttp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Description:
 * @Author baoJie
 * @Date 2022/6/18 17:47
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class HttpProcessorModule {

    @BindOkhttp
    @Binds
    @Singleton
    abstract fun bindOkhttp(okHttpProcessor: OkHttpProcessor): IHttpProcessor
}