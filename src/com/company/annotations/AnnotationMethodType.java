/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Gokul on Aug,2020,26-08-2020 at 13:40
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String AccountHolder() default "Gokul";

}
public class AnnotationMethodType {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<AnnotationMethodType> typeClass= AnnotationMethodType.class;
        Method method = typeClass.getMethod("getAnnotations");
        Annotation[] annotation = method.getAnnotations();
        for(Annotation annotatios:annotation){
            if(annotatios instanceof MyAnnotation){
                MyAnnotation myAnnotation = (MyAnnotation) annotatios;
                System.out.println(myAnnotation.AccountHolder());
            }
        }

    }
    @MyAnnotation(
            AccountHolder = "Hairsh"
    )
    public void getAnnotations(){
        System.out.println("Hello");

    }
}
