package com.noyss.app.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ManageHeaderAspect {



    private static Logger LOGGER = LoggerFactory.getLogger(ManageHeaderAspect.class);


    @Pointcut("execution(@(@org.springframework.web.bind.annotation.RequestMapping *) * *(..))")
    public void requestMappingAnnotations() {

    }


    @Pointcut("execution(* com.noyss.app.controller.*.*(..))")
    public void anyControllerMethod() {
    }


    @Pointcut("execution(public * *(..))")
    public void anyPublicMethod() {
    }

    @Before("requestMappingAnnotations()")
    public void insertDataUserDetails(JoinPoint pjp) {

                LOGGER.info("@Before(\"requestMappingAnnotations()\")");

    }
}
