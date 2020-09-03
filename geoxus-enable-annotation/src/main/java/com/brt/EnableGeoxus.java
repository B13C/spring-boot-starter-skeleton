package com.brt;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(MyRegistrar.class)
@Import(MyImportSelector.class)
public @interface EnableGeoxus {
}
