package net.engineeringdigest.journalApp.ExceptionHandelling;

import net.engineeringdigest.journalApp.controller.CustomException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandeller {

    @ExceptionHandler(ArithmeticException.class)
 public String handleNullPointerException(ArithmeticException e) {
    return "NullPointerException";
 }
 @ExceptionHandler(CustomException.class)
 public String handleCustomException(CustomException e) {
    return "CustomException";
 }


}
