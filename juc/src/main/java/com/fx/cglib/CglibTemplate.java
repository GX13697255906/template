package com.fx.cglib;

import cn.hutool.aop.proxy.CglibProxyFactory;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.cglib.reflect.FastClass;
import org.springframework.cglib.reflect.FastMethod;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author xun.guo
 * <p>
 * Spirng动态代理
 */
public class CglibTemplate {


    public static void main(String[] args) throws Throwable {

        Map<String, Class> pathToParentClassMap = new HashMap<>();
        Map<String, String> pathToMethodMap = new HashMap<>();

        String pathKey = "getName";
        Class userDaoClass = UserDao.class;
        pathToParentClassMap.put(pathKey, userDaoClass);
        pathToMethodMap.put(pathKey, "getName");

        FastClass serviceFastClass = FastClass.create(pathToParentClassMap.get(pathKey));
        Class[] clas = new Class[]{String.class};
        FastMethod serviceFastMethod = serviceFastClass.getMethod(pathToMethodMap.get(pathKey), clas);

    }


}
