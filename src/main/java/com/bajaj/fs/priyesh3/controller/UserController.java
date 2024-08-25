package com.bajaj.fs.priyesh3.controller;


import com.bajaj.fs.priyesh3.model.ResponseData;
import com.bajaj.fs.priyesh3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bfhl")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<ResponseData> handlePostRequest(@RequestBody List<String> data) {

        String userId = "priyeshkrsingh03";
        String email = "priyeshkrsingh03@gmail.com";
        String rollNumber = "21BCE4000";
        ResponseData response = userService.processPostRequest(data, userId, email, rollNumber);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> handleGetRequest() {
        int operationCode = userService.processGetRequest();
        return new ResponseEntity<>("{\"operation_code\":" + operationCode + "}", HttpStatus.OK);
    }
}
