package br.com.uislancruz.events.controller;

import br.com.uislancruz.events.dto.ErrorDTO;
import br.com.uislancruz.events.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(exception = NotFoundException.class)
    public ResponseEntity<ErrorDTO> handNotFoundException(NotFoundException ex) {

        return ResponseEntity.status(404).body(new ErrorDTO(ex.getMessage()));
    }
}
