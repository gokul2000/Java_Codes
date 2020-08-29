/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.annotations;

import java.lang.annotation.*;

/**
 * Created by Gokul on Aug,2020,26-08-2020 at 13:25
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    String accountHolder() default "Gokul";
    int accountNumber() default 1234;
}
//Annotations in Class
@MyAnn(accountHolder = "Harish",accountNumber = 23456)
public class AnnotationOneClassType {
    public static void main(String[] args) {
        Class<AnnotationOneClassType> c = AnnotationOneClassType.class;
        Annotation [] annotation = c.getAnnotations();
        for(Annotation annotation1 :annotation){
            if(annotation1 instanceof  MyAnn){
                MyAnn myAnn = (MyAnn) annotation1;
                System.out.println(myAnn.accountNumber());
                System.out.println(myAnn.annotationType());
                System.out.println(myAnn.accountHolder());
            }
        }

    }
}
