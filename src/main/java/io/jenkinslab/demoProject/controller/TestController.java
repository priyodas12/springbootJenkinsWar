package io.jenkinslab.demoProject.controller;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	private final AtomicInteger counter = new AtomicInteger(0);
	 
    @GetMapping("/counter")
    public String myView(Map model) {
        System.out.println("***********"+new Date());
        counter.set(counter.get()+1);
        model.put("counter", counter.get());
        return "demo-view-page";
    }
}
