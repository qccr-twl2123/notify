package com.qccr.notify.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qccr.notify.biz.service.notify.NotifyService;
import com.qccr.notify.model.notify.NotifyDO;

@Controller
@RequestMapping("/notify")
public class NotifyController {
	
	@Resource
	private NotifyService notifyService;
	
	@RequestMapping("add")
	public void insertNotify(){
		System.out.print("add");
		NotifyDO n = new NotifyDO();
		n.setType(2);
		n.setAction("like");
		n.setContent("content");
		n.setSender(12);
		n.setTarget(12);
		n.setTargetType(1);
		notifyService.insertNotify(n);
		
	}

}
