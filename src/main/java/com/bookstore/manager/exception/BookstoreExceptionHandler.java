package com.bookstore.manager.exception;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@ControllerAdvice
public class BookstoreExceptionHandler extends ResponseEntityExceptionHandler {

    private ResponseEntity<Object> buildResponseEntity(HttpStatus httpStatus, String message, List<String> errors){
        ApiError apiError = ApiError.builder()
                .code(httpStatus.value())
                .status(httpStatus.getReasonPhrase())
                .message(message)
                .errors(errors)
                .timestamp(LocalDate.from(LocalDateTime.now()))
                .build();
        return ResponseEntity.status(httpStatus).body(apiError);
    }
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handlerEntityNotFoundException(EntityNotFoundException exception){
        return buildResponseEntity(HttpStatus.NOT_FOUND, exception.getMessage(), Collections.singletonList(exception.getMessage()));
    }
    @ExceptionHandler(EntityExistsException.class)
    public ResponseEntity<Object> handlerEntityExistException(EntityExistsException exception){
        return buildResponseEntity(HttpStatus.BAD_REQUEST, exception.getMessage(), Collections.singletonList(exception.getMessage()));
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException exception, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return buildResponseEntity(HttpStatus.BAD_REQUEST, "Malformed JSON body and/or field error", Collections.singletonList(exception.getLocalizedMessage()));
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException exception, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<String> errors = new LinkedList<>();
        exception.getBindingResult().getFieldErrors().forEach(x-> errors.add("Field "+x.getField().toUpperCase() + " " + x.getDefaultMessage()));
        exception.getBindingResult().getAllErrors().forEach(y-> errors.add("Object "+y.getObjectName() + " " + y.getDefaultMessage()));
        return buildResponseEntity(HttpStatus.BAD_REQUEST, "Informed argument(s) validation error(s)", errors);
    }
}
