package com.sanxin.wechatxposed.util

import android.widget.Toast
import com.sanxin.wechatxposed.App

/**
 * 描述：工具方法扩展文件
 *
 * @author CoderPig on 2018/04/27 12:26.
 */
fun shortToast(msg: String) = Toast.makeText(App.instance, msg, Toast.LENGTH_SHORT).show()

fun longToast(msg: String) = Toast.makeText(App.instance, msg, Toast.LENGTH_LONG).show()

inline fun <reified T> toArray(list: List<*>): Array<T> {
    return (list as List<T>).toTypedArray()
}
