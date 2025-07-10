package com.raniele.cadastrodecliente.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class PessoaExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ClienteNaoEncontradoException.class)
	private ResponseEntity<String> clienteNaoEncontradoHandler(ClienteNaoEncontradoException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse cliente não existe no nosso banco de dados.");
	}

}
