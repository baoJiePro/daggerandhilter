package com.baojie.learn.hiltapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baojie.learn.hiltapp.utils.logD
import com.baojie.learn.hiltapp.R
import com.baojie.learn.hiltapp.hilt.HttpObject
import com.baojie.learn.hiltapp.hilt.Student
import com.baojie.learn.hiltapp.hilt.User
import com.baojie.learn.hiltapp.interfacedi.People
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class SecActivity : AppCompatActivity() {

    @Inject lateinit var httpObject3: HttpObject
    @Inject lateinit var user3: User
    @Inject lateinit var student3: Student

    @Named("child") @Inject lateinit var child3: People

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        logD("httpObject3= ${httpObject3.hashCode()}")
        logD("user3= ${user3.hashCode()}")
        logD("student3= ${student3.hashCode()}")
        logD("child3= ${child3.hashCode()}")
    }
}