package com.baojie.learn.hilt.learn1.module

import com.baojie.learn.hilt.learn1.bean.HttpObj
import com.baojie.learn.hilt.learn1.bean.User
import com.baojie.learn.hilt.learn1.scope.AppScope
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

/**
 * @Description: TODO
 * @Author baojie
 * @Date 2022/6/13 23:16
 */
/**
 * 提供对象
 */
@Module
class HttpModule {

    @AppScope
    @Provides
    fun providerHttpObj(): HttpObj {
        return HttpObj()
    }

    @Named("key1")
    @Provides
    fun providerUser1(): User{
        return User("jack", 22)
    }

    @Named("key2")
    @Provides
    fun providerUser2(): User{
        return User("lucy", 30)
    }
}