package com.myserver.mock.exchange.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/config/controller/website/pricecontroller")
public class PriceController {
	
	@RequestMapping("/getassistprice")
	@ResponseBody
	String getAssistPrice(){
		
		return "";
	}
	
	

}
