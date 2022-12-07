package com.pda.mobile.handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.BeanInstantiationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.pda.mobile.beans.ResponseBean;

@ControllerAdvice
public class CustomRestExceptionHandler {

	@ExceptionHandler({ ConstraintViolationException.class })
	public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException ex,
			WebRequest request) {
		ResponseBean rt = new ResponseBean();
		rt.setStatus(400);
		List<String> ms = new ArrayList<>();
		Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();
		for (ConstraintViolation<?> violation : violations) {
			ms.add(violation.getMessage());
		}
		rt.setMessage(ms);
		return new ResponseEntity<Object>(rt, new HttpHeaders(), HttpStatus.OK);
	}

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {
		ResponseBean rt = new ResponseBean();
		rt.setStatus(500);

		rt.setMessage(rt.getMessage());
		return new ResponseEntity<Object>(rt, new HttpHeaders(), HttpStatus.OK);
	}

	@ExceptionHandler({ BeanInstantiationException.class })
	public ResponseEntity<Object> handleBeanInstantiationException(BeanInstantiationException ex, WebRequest request) {
		ResponseBean rt = new ResponseBean();
		rt.setStatus(401);
		rt.setMessage(rt.getMessage());
		return new ResponseEntity<Object>(rt, new HttpHeaders(), HttpStatus.OK);
	}
}