package com.baojie.learn.hilt.learn1.di

import com.baojie.learn.hilt.learn1.scope.UserScope
import dagger.Module
import dagger.Provides

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/14 23:48
 */
@Module
class PresenterModule {

    @UserScope
    @Provides
    fun providerPresenter(): Presenter {
        return Presenter()
    }
}