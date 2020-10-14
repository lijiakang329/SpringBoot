package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//如果这里使用的是@Constroller而不是@RestController，就不会返回下面的字符串'hello Spring boot'，则必须在say()方法前加上@ResponseBody，表示它可以返回json或其他文本
@Controller
public class Hello {
    //仅是@Controller注解并不能返回字符串，必须配合@ResponseBody使用
    @ResponseBody
    //@RequestMapping("/")这个注解表示会拦截localhost：8080/这个url，并返回你的内容，你可以将括号内的地址随意更换，每当你访问次url，都会拦截
    @RequestMapping("/")
    public String say(){
        return "hello Spring boot3";
    }
}

/**
 * 这里如果使用@RestController注解，则不需要在每个方法前加上@ResponseBody这个注解了
 * @RestController
 * public class Hello {
 *     @RequestMapping("/")
 *     public String say(){
 *         return "hello Spring boot22";
 *     }
 * }
 */
