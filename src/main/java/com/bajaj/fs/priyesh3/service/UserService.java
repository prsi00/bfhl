package com.bajaj.fs.priyesh3.service;

import com.bajaj.fs.priyesh3.model.ResponseData;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    public ResponseData processPostRequest(List<String> data, String userId, String email, String rollNumber) {
        List<String> numbers = data.stream().filter(this::isNumeric).collect(Collectors.toList());
        List<String> alphabets = data.stream().filter(s -> !isNumeric(s)).collect(Collectors.toList());
        List<String> lowercaseAlphabets = alphabets.stream()
                .filter(s -> s.matches("[a-z]"))
                .collect(Collectors.toList());

        String highestLowercaseAlphabet = lowercaseAlphabets.stream().max(String::compareTo).orElse("");

        ResponseData responseData = new ResponseData();
        responseData.setSuccess(true);
        responseData.setUserId(userId);
        responseData.setEmail(email);
        responseData.setRollNumber(rollNumber);
        responseData.setNumbers(numbers);
        responseData.setAlphabets(alphabets);
        responseData.setHighestLowercaseAlphabet(List.of(highestLowercaseAlphabet));

        return responseData;
    }

    public int processGetRequest() {
        return 1;
    }

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
