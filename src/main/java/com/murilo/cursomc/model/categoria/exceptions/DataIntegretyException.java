package com.murilo.cursomc.model.categoria.exceptions;

public class DataIntegretyException extends RuntimeException{
    private String nomeDoAtributo;

    public DataIntegretyException(String nomeDoAtributo) { // Parametro para ser chamado
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return nomeDoAtributo; // Mensagem
    }
}
