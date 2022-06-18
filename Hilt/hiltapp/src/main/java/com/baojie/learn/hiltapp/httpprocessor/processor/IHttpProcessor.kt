package com.baojie.learn.hiltapp.httpprocessor.processor

/**
 * @Description:
 * @Author baoJie
 * @Date 2022/6/18 14:47
 */
interface IHttpProcessor {
    fun post(url: String, params: Map<String, Any>, callback: ICallback)
}