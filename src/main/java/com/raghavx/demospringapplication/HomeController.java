package com.raghavx.demospringapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public HomeData home() {
		HomeData hd = new HomeData();
		hd.setName("Jhon");
		hd.setId(32);
		return hd;
	}

}
