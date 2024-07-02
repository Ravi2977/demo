package com.example.demo;

//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
//import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class Controller {


    @GetMapping("/hello")
    public List<String> hello(){
        List<String > list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add("Hello World");
        }
   
        return list;
    }
}
