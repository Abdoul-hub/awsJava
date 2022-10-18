/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cabral.awstest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author togola080925
 */
@RestController
public class TestController {
    
    
    
    @GetMapping("enpoint")
    public String getHello(){
        
        
        return "hello cabral !!";
    }
    
    
     @GetMapping("test")
    public String getHello(){
        
        
        return "its works !!";
    }
}
