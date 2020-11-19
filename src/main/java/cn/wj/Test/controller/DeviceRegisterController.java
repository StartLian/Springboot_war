package cn.wj.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wj.Test.dao.db1.RegisterInfoMapper;

@RestController
@RequestMapping("/DeviceRegister")
public class DeviceRegisterController {
	@Autowired
	RegisterInfoMapper registerInfoMapper;
	
	@RequestMapping("/get139LupdataNum")
	public String sayHello() {
		int get139LupdataNum = registerInfoMapper.get139LupdataNum("WEL_M139_0101_201030");
		System.out.println("get139LupdataNum:"+get139LupdataNum);
		return "139L:"+get139LupdataNum;
	}
}
