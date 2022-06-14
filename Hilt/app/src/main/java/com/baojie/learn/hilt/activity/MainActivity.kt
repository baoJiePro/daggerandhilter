package com.baojie.learn.hilt.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.baojie.learn.hilt.MyApplication
import com.baojie.learn.hilt.R
import com.baojie.learn.hilt.learn1.bean.HttpObj
import com.baojie.learn.hilt.learn1.bean.User
import com.baojie.learn.hilt.learn1.di.Presenter
import com.baojie.learn.hilt.utils.logD
import com.blankj.utilcode.util.ActivityUtils
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var httpObj: HttpObj

    @Inject
    lateinit var httpObj2: HttpObj

    @Inject
    lateinit var presenter: Presenter

    @Inject
    lateinit var presenter2: Presenter

    @Named("key1")
    @Inject
    lateinit var user1: User

    @Named("key2")
    @Inject
    lateinit var user2: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerMyComponent.create().injectMainActivity(this)
//        DaggerMyComponent.builder()
//            .httpModule(HttpModule())
//            .build()
//            .injectMainActivity(this)
        (application as MyApplication).getComponent().injectMainActivity(this)
        logD("${httpObj.hashCode()}")
        logD("${httpObj2.hashCode()}")
        logD("${presenter.hashCode()}")
        logD("${presenter2.hashCode()}")
        logD(user1.name)
        logD(user2.name)
        findViewById<Button>(R.id.btn).setOnClickListener {
            ActivityUtils.startActivity(SecondActivity::class.java)
        }
    }
}