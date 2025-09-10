package com.authservice.userdto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class APIResponse<T> {

	 private String message;
	 private int status;
	 private T data;
}
