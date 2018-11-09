package com.azure.coconut.webvalidation;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/")
public class PersonalRegistryController {

    @RequestMapping(value = "register",method = RequestMethod.POST)
    public String registerPerson(@Valid Person person, Errors errors){
        if(errors.hasErrors()){
            for(ObjectError error:errors.getAllErrors()){
                System.out.println(error.getDefaultMessage());
            }
            return "Error";
        }else{
            return "OK";
        }
    }
}
