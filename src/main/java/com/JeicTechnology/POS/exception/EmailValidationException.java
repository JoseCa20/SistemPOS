package com.JeicTechnology.POS.exception;

public class EmailValidationException extends RuntimeException{

    public EmailValidationException(){
        super("Formato de email incorrecto");
    }
}
