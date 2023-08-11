package com.example.backend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Integer consultantId){
        super("Could not found the user with id "+ consultantId);
    }
}
