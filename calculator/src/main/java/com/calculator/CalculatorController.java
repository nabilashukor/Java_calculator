package com.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {
	
	@GetMapping("/calculator/{operation}/{num1}/{num2}")
	public String Calculate(@PathVariable String operation, @PathVariable double num1, @PathVariable double num2) {
		
		double result = 0.0;
		
		//check operation
		switch (operation) {
			case "add":
				result = num1 + num2;
				break;
			case "sub":
				result = num1 - num2;
				break;
			case "mul":
				result = num1 * num2;
				break;
			case "div":
				result = num1 / num2;
				break;
		}
		return
				"Result is " + result;
	}
	
}

