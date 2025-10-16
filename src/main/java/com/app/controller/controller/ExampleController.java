package com.app.controller.controller;

import com.app.controller.domain.vo.ProductVO;
import com.app.controller.domain.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ex/*")
@Slf4j
public class ExampleController {
    @GetMapping("/ex01")
    public void ex01(@RequestParam("name") String name,@RequestParam("age") int age) {
        log.info("ex01");
        log.info(name);
        log.info(String.valueOf(age));
    }

    @GetMapping("/ex02")
    public void ex02(@RequestParam("name") String name, @RequestParam("job") String job, Model model) {
        log.info("ex02");
        model.addAttribute("name", name);
        model.addAttribute("job", job);
    }
    @GetMapping("/ex03")
    public void ex03(@RequestParam("name") String name ,@RequestParam("money") int money) {
        log.info("이름: {}, 용돈: {}, 용돈 - 5000: {}", name, money, money - 5000);
    }

    @GetMapping("/ex04")
    public void ex04() {;}


    @GetMapping("/ex05")
    public void ex05(UserVO userVO, Model model) {
        model.addAttribute("userVO", userVO);
    }

    @GetMapping("/ex06")
    public void ex06() {;}

    @GetMapping("/ex07")
    public void ex07(ProductVO productVO, Model model) {
        model.addAttribute("productVO", productVO);
    }

}
