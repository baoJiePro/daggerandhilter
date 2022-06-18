package com.baojie.learn.hiltapp.interfacedi

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/18 09:34
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class PeopleModule {

    @Binds
    @ActivityScoped
    @Named("child")
    abstract fun bindChild(child: Child): People

    @Binds
    @ActivityScoped
    @Named("farther")
    abstract fun bindFarther(farther: Farther): People

    @Binds
    @ActivityScoped
    @Named("mouther")
    abstract fun bindMouther(mouther: Mouther): People
}