package co.edu.sena.springmvc2242753.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("in global exception handler");
        return "error";
    }
}
