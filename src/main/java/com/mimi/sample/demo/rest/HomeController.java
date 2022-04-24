package com.mimi.sample.demo.rest;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public void home(HttpServletResponse response) throws IOException {
		response.sendRedirect("/index.jsp");
	}
}
