package com.pda.mobile.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * 
 * @version 0.0.1
 * @since 0.0.1
 */
@Data
public class CurrentUser {

	private String userId;
	private String username;
	private String email;
	private List<String> roles;
	protected Map<String, List<String>> attributes;
	protected Map<String, List<String>> listPathAccess;	
}