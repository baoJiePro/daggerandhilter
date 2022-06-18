package com.baojie.learn.hiltapp.interfacedi

import com.baojie.learn.hiltapp.utils.logD
import javax.inject.Inject

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/18 09:46
 */
class Mouther @Inject constructor() : People {

    override fun showName() {
        logD("mouther showName")
    }
}