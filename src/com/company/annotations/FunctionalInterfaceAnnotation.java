/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Gokul on Aug,2020,27-08-2020 at 09:07
 */
@FunctionalInterface
interface CardDetails{
    String getCardDetails();
}
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface functionalInterface{
    String name();
}
public class FunctionalInterfaceAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        CardDetails cardDetails= ()-> "Master Card Holder with an Account Balance of Rs.2,00,0000";
        System.out.println(cardDetails.getCardDetails());
        Class<FunctionalInterfaceAnnotation> functionalInterfaceAnnotationClass=FunctionalInterfaceAnnotation.class;
        Method method = functionalInterfaceAnnotationClass.getMethod("interfaceChecker", int.class);
        Parameter parameter = method.getParameters()[0];
        Annotation annotation = parameter.getAnnotation(functionalInterface.class);
        functionalInterface fun=(functionalInterface)annotation;
        System.out.println(fun.name());

    }
    public static String interfaceChecker(@functionalInterface(name = "Hari") int v)
    {
        return null;
    }


}
