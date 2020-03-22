/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jiwt.learnbasic.reflection;

/**
 *
 * @author jiwt
 */
public class Employee extends Human {

    private String id;

    public String code;

    public String name;
    
    public Department department;
    
    Employee(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public String getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(String id) {
        this.id = id;
    }

    
    @Override
    public void say(String content) {
        System.out.println(content);
    }

}
