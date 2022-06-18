package com.baojie.learn.hiltapp.httpprocessor.processor

/**
 * @Description:
 * @Author baoJie
 * @Date 2022/6/18 14:48
 */
interface ICallback {
    fun onSuccess(result: String)
    fun onFailure(e: String)
}