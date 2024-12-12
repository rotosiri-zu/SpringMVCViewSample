package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloViewController {
	@GetMapping("model")
	public String helloview(Model model) {
		// [Model]にデータを格納する
		model.addAttribute("msg", "タイムリーフ!!!");		
		// 戻り値は「ビュー名」を返す
		return "hello";
	}
}
