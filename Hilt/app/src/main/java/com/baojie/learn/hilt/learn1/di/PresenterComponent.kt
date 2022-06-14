package com.baojie.learn.hilt.learn1.di

import com.baojie.learn.hilt.activity.MainActivity
import com.baojie.learn.hilt.learn1.scope.UserScope
import dagger.Component

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/14 23:50
 */
@UserScope
@Component(modules = [PresenterModule::class])
interface PresenterComponent {

//    fun inject(activity: MainActivity)
    fun providerPresenter(): Presenter
}