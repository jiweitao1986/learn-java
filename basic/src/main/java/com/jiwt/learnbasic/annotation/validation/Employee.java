/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.annotation.validation;

/**
 *
 * @author jiwt
 */
public class Employee {
    
    @PrimaryKey
    public String id;
    
    @Required
    public String code;
    
    @Required
    @MaxLength(maxlength = 100, errorMessage = "Name MaxLength Error")
    public String name;
}
