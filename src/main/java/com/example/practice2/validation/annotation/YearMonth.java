package com.example.practice2.validation.annotation;

import com.example.practice2.validation.validator.YearMonthValidator;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = {YearMonthValidator.class})
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)

public @interface YearMonth {
    String message() default "{year month 형식에 맞지 않음 (예) 199012}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    String pattern() default "yyyyMMdd";


}
