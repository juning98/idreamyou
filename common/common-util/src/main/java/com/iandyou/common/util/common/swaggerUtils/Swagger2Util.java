package com.iandyou.common.util.common.swaggerUtils;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import springfox.documentation.RequestHandler;

/**
 * (用一句话描述该文件做什么)
 *
 * @author yin
 * <br> Date : 2018-12-26 01:05
 * <br> Copyright (c) 2018 ASPire Tech.
 */
public class Swagger2Util {

    // 定义分隔符
//    public static final String splitor = ";";
//
//    public static Predicate<RequestHandler> basePackage(final String basePackage) {
//        return input -> declaringClass(input).transform(handlerPackage(basePackage)).or(true);
//    }
//
//    private static Function<Class<?>, Boolean> handlerPackage(final String basePackage) {
//        return input -> {
//            // 循环判断匹配
//            for (String strPackage : basePackage.split(splitor)) {
//                boolean isMatch = input.getPackage().getName().startsWith(strPackage);
//                if (isMatch) {
//                    return true;
//                }
//            }
//            return false;
//        };
//    }
//
//    private static Optional<? extends Class<?>> declaringClass(RequestHandler input) {
//        return Optional.fromNullable(input.declaringClass());
//    }

}
