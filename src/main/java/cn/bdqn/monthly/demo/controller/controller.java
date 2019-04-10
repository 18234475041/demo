package cn.bdqn.monthly.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
public class controller {
    @RequestMapping("/ss")
    public  String sc(){
        return "index";
    }
}
