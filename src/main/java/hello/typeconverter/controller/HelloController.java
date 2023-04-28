package hello.typeconverter.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    @GetMapping("/hello-v1")
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data");
        Integer intValue = Integer.valueOf(data);
        System.out.println("intValue = " + intValue);
        return "ok";
    }

    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {
        System.out.println("data = " + data);
        return "ok";
    }

//    @GetMapping("/hello-v3")
//    public String helloV3(@ModelAttribute UserData data) {
//        System.out.println("data = " + data.getData());
//        return "ok";
//    }
//
//    @GetMapping("/hello-v4/{userId}")
//    public String helloV4(@PathVariable("userId") Integer data) {
//        System.out.println("data = " + data);
//        return "ok";
//    }
//
//
//    @Data
//    class UserData {
//        Integer data;
//    }
}
