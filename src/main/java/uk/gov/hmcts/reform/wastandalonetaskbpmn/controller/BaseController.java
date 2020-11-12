package uk.gov.hmcts.reform.wastandalonetaskbpmn.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {


	@GetMapping("/")
	public String greeting() {
		return "Welcome to test service";
	}
}
