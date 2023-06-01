package uk.gov.hmcts.reform.wastandalonetaskbpmn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class BaseController {

    @GetMapping("/")
    public ResponseEntity<String> greeting() {
        return ok("Welcome to WA Standalone Task BPMN");
    }
}
