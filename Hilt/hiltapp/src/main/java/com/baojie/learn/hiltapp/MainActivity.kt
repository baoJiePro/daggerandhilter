package com.baojie.learn.hiltapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.baojie.learn.hiltapp.utils.logD
import com.baojie.learn.hiltapp.activity.SecActivity
import com.baojie.learn.hiltapp.databinding.ActivityMainBinding
import com.baojie.learn.hiltapp.hilt.HttpObject
import com.baojie.learn.hiltapp.hilt.Student
import com.baojie.learn.hiltapp.hilt.User
import com.baojie.learn.hiltapp.interfacedi.Mouther
import com.baojie.learn.hiltapp.interfacedi.People
import com.blankj.utilcode.util.ActivityUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var httpObject: HttpObject

    @Inject lateinit var httpObject2: HttpObject

    @Inject lateinit var user: User
    @Inject lateinit var user2: User
    @Inject lateinit var student: Student
    @Inject lateinit var student2: Student

    @Named("child") @Inject lateinit var child: People
    @Named("child") @Inject lateinit var child2: People
    @Named("farther") @Inject lateinit var farther: People
    @Named("mouther") @Inject lateinit var mouther: People

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        initData()

        logD("httpObject= ${httpObject.hashCode()}")
        logD("httpObject2= ${httpObject2.hashCode()}")
        logD("user= ${user.hashCode()}")
        logD("user2= ${user2.hashCode()}")
        logD("student= ${student.hashCode()}")
        logD("student2= ${student2.hashCode()}")
        logD("child= ${child.hashCode()}")
        logD("child2= ${child2.hashCode()}")
        logD("farther= ${farther.hashCode()}")
        logD("mouther= ${mouther.hashCode()}")
        child.showName()
        child2.showName()
        farther.showName()
        mouther.showName()
    }

    private fun initData() {
        binding.btn.setOnClickListener {
            ActivityUtils.startActivity(SecActivity::class.java)
        }
    }
}