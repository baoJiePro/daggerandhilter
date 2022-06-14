package com.baojie.learn.hilt.learn1.component

import com.baojie.learn.hilt.activity.MainActivity
import com.baojie.learn.hilt.activity.SecondActivity
import com.baojie.learn.hilt.learn1.di.PresenterComponent
import com.baojie.learn.hilt.learn1.module.DatabaseModule
import com.baojie.learn.hilt.learn1.module.HttpModule
import com.baojie.learn.hilt.learn1.scope.AppScope
import dagger.Component
import javax.inject.Singleton

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/13 23:19
 */
/**
 * 组件
 */
@AppScope
@Component(
    modules = [HttpModule::class, DatabaseModule::class],
    dependencies = [PresenterComponent::class]
)
interface MyComponent {

    fun injectMainActivity(activity: MainActivity)
    fun injectSecondActivity(activity: SecondActivity)
}