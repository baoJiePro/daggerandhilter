package com.baojie.learn.hilt

import android.app.Application
import com.baojie.learn.hilt.learn1.component.DaggerMyComponent
import com.baojie.learn.hilt.learn1.component.MyComponent
import com.baojie.learn.hilt.learn1.di.DaggerPresenterComponent

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/14 23:29
 */
class MyApplication : Application() {

    lateinit var myComponent: MyComponent

    override fun onCreate() {
        super.onCreate()
        myComponent =
            DaggerMyComponent.builder()
                .presenterComponent(DaggerPresenterComponent.create())
                .build()
    }

    fun getComponent(): MyComponent {
        return myComponent
    }

}