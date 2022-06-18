package com.baojie.learn.hiltapp.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/18 08:15
 */
@InstallIn(SingletonComponent::class)
@Module
class HttpModule {

    @Singleton
    @Provides
    fun getHttpObject(): HttpObject {
        return HttpObject()
    }
}