package com.wangqi.controller.manage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("aboutActionController")
@RequestMapping("/")
public class AboutAction {

    @RequestMapping("about")
    public String contact(){
        return "front/about/about";
    }
}
