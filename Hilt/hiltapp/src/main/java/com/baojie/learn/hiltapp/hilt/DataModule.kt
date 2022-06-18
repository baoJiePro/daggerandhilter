package com.baojie.learn.hiltapp.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/18 08:54
 */
@InstallIn(ActivityComponent::class)
@Module
class DataModule {

    @ActivityScoped
    @Provides
    fun providerUser(): User {
        return User()
    }

    @Provides
    fun providerStudent(): Student {
        return Student()
    }
}