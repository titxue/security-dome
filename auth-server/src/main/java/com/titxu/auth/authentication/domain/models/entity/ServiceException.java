package com.titxu.auth.authentication.domain.models.entity;

import com.titxu.auth.authentication.domain.client.enums.LoginCode;

/**
 * @author lxue
 */
public class ServiceException extends RuntimeException
{
 
	private static final long serialVersionUID = -2440105546095427374L;
 
	public ServiceException()
	{
		super();
	}

 
	public ServiceException(String message)
	{
		super(message);
	}
	public ServiceException(LoginCode loginCode)
	{
		super(loginCode.getMessage());
	}
 
	public ServiceException(String message, Throwable cause)
	{
		super(message, cause);
	}
 
	public ServiceException(Throwable cause)
	{
		super(cause);
	}
}