package com.qccr.notify.controller;

import javax.annotation.Resource;

import com.qccr.notify.biz.eventbus.ArticleEventbus;
import com.qccr.notify.biz.eventbus.ArticleListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qccr.notify.biz.service.notify.NotifyService;
import com.qccr.notify.model.notify.NotifyDO;

@Controller
@RequestMapping("/notify")
public class NotifyController {
	
	@Resource
	private NotifyService notifyService;
	@Resource
	private ArticleListener articleListener;
	@Resource
	private ArticleEventbus articleEventbus;
	
	@RequestMapping("add")
	public void insertNotify(){
		System.out.print("add");
		NotifyDO n = new NotifyDO();
		n.setType(1);
		n.setTarget(1);
		n.setTargetType(1);

		n.setAction("like");
		n.setSender(4);
		notifyService.insertNotify(n);
		articleEventbus.register(articleListener);
		articleEventbus.post(n);

	}

}
