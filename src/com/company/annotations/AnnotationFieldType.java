/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * Created by Gokul on Aug,2020,26-08-2020 at 13:57
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface AnnotationType{
    String AccountHolder() default "Gokul";

}
public class AnnotationFieldType {
    @AnnotationType(AccountHolder = "Hari")
    public String annotation = "Annpptation";

    public static void main(String[] args) throws NoSuchFieldException {
        Class<AnnotationFieldType> fieldTypeClass = AnnotationFieldType.class;
        Field field = fieldTypeClass.getField("annotation");
        Annotation[] annotations = field.getAnnotations();
        for(Annotation annotation1:annotations){
            if(annotation1 instanceof AnnotationType){
                AnnotationType annotationType = (AnnotationType)annotation1;
                System.out.println(annotationType.AccountHolder());
            }

        }

    }
}
