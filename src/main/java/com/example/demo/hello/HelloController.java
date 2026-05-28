package com.example.demo.hello;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@Autowired
	private SampleService sampleService;
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	@GetMapping("/hello")
	public String getHello() {
		// hello.htmlに画面
		return "hello";
	}
	
	@PostMapping("/hello")
	public String postHello(@RequestParam("text1") String text1,Model model) {
		model.addAttribute("response",text1);
		
		return "hello/response";
	}
	
	@GetMapping("/hello/db")
	public String getSample(@RequestParam(value = "id", required = false) String id,Model model) {
		if (id == null || id.isBlank()) {
			model.addAttribute("idError", "IDを入力してください。");
			return "hello";
		}

		// １件検索
		Optional<Sample> sample = sampleService.getSample(id);
		
		//検索結果をModelに登録
		model.addAttribute("sample", sample.orElse(null));
		model.addAttribute("id", id);
		
		// db.htmlに画面遷移
	return "hello/db";
	}
}
