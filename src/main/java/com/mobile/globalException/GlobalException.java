package com.mobile.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mobile.Exception.BrandException;
import com.mobile.Exception.PriceException;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(BrandException.class)
	public ResponseEntity<String> getmethod(BrandException be){
		return new ResponseEntity<>(be.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> get(NullPointerException ne){
		return new ResponseEntity<>("This value is empty",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(PriceException.class)
	public ResponseEntity<String> getp(PriceException pe){
		return new ResponseEntity<>(pe.getMessage(),HttpStatus.BAD_REQUEST);
	}
}

