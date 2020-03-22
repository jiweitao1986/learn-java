/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learn.annotation.validation;

/**
 *
 * @author jiwt
 */
public @interface Required {
    String errorMessage() default "Required Error";
}
