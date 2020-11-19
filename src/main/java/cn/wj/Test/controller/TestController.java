package cn.wj.Test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
	@RequestMapping("/test")
	public String getUserinfo() {
		System.out.println("ghjjghkjkgh");
		return "4897465453";
	}
}
