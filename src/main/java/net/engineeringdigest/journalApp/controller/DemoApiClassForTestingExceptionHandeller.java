package net.engineeringdigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Handeller")
public class DemoApiClassForTestingExceptionHandeller {

    @GetMapping("/method1")
    public void method1(){
        int a=1/0;
        System.out.println("hhiii");
    }

    @GetMapping("/method2")
    public void method2()throws CustomException{
        throw new CustomException("customException");
    }

}
