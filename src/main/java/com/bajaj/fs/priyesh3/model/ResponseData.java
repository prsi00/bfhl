package com.bajaj.fs.priyesh3.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Getter
@Setter
public class ResponseData {

        private boolean isSuccess;
        private String userId;
        private String email;
        private String rollNumber;
        private List<String> numbers;
        private List<String> alphabets;
        private List<String> highestLowercaseAlphabet;

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public void setHighestLowercaseAlphabet(List<String> highestLowercaseAlphabet) {
        this.highestLowercaseAlphabet = highestLowercaseAlphabet;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public List<String> getHighestLowercaseAlphabet() {

        return highestLowercaseAlphabet;
    }
}
