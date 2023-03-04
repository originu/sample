package com.jaedam.sample.controller;


import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample")
    public ResponseEntity<ObjectNode> sample() {
        ObjectNode jsonNodes = JsonNodeFactory.instance.objectNode();
        jsonNodes.put("name", "kevin");
        return new ResponseEntity<>(jsonNodes, HttpStatus.OK);
    }
}
