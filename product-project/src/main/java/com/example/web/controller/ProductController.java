package com.example.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {
@GetMapping("/data")
public String meth1()
{
	return "<h1>Welcome to Product Page of Ayisha!</h1>";
}
}
