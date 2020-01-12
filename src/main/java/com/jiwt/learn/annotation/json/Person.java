/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learn.annotation.json;
import java.util.UUID;  

/**
 *
 * @author jiwt
 */
@JsonSerializable
public class Person {

    private String id;

    @JsonElement
    private String code;    

    @JsonElement
    private String name;
 
    @JsonElement(key = "personAge")
    private String age;

    public Person(String code, String name, String age) {
        this.id = UUID.randomUUID().toString();
        this.code = code;
        this.name = name;
        this.age = age;
    }
 
    @Init
    private void initNames() {
        this.code = this.code.substring(0, 1).toUpperCase() 
          + this.code.substring(1);
    }
}