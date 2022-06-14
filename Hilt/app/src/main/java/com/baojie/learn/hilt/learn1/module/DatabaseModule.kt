package com.baojie.learn.hilt.learn1.module

import com.baojie.learn.hilt.learn1.bean.DatabaseObj
import dagger.Module
import dagger.Provides

/**
 * @Description: TODO
 * @Author baojie
 * @Date 2022/6/13 23:16
 */
/**
 * 提供对象
 */
@Module
class DatabaseModule{

    @Provides
    fun providerDatabaseObj(): DatabaseObj {
        return DatabaseObj()
    }
}