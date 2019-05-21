package helloWord.controller;

import helloWord.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping
public class HelloController {

    @Autowired
    IHelloService helloService;

    @RequestMapping("/index.html")
    public String helloword(Map<String, Object> map){
        map.put("text", helloService.getText());
        return "index";
    }
}
