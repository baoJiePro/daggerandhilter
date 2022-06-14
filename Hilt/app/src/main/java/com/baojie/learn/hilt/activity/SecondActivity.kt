package com.baojie.learn.hilt.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baojie.learn.hilt.MyApplication
import com.baojie.learn.hilt.R
import com.baojie.learn.hilt.learn1.bean.HttpObj
import com.baojie.learn.hilt.utils.logD
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var httpObj: HttpObj

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

//        DaggerMyComponent.builder()
//            .httpModule(HttpModule())
//            .build()
//            .injectSecondActivity(this)

        (application as MyApplication).getComponent().injectSecondActivity(this)

        logD("${httpObj.hashCode()}")
    }
}