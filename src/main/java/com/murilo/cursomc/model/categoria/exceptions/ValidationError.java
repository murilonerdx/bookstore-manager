package com.murilo.cursomc.model.categoria.exceptions;

import com.murilo.cursomc.exceptions.FieldMessage;
import com.murilo.cursomc.exceptions.StandardError;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private List<FieldMessage> errors = new ArrayList<>();
    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String filedName, String messagem){
        errors.add(new FieldMessage(filedName, messagem));
    }
}
