package com.baojie.learn.hilt.learn1.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @Description: TODO
 * @Author baoJie
 * @Date 2022/6/15 00:03
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface UserScope {
}
