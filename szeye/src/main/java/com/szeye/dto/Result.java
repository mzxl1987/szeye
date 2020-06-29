package com.szeye.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class Result implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int code;
	private String msg;
	private Object data;
	private String token;
	private boolean success;
	private long total;
	
	public Result() {}
	
	private Result(int code, String msg){
		this.code = code;
		this.msg = msg;
	}
	
	private Result(ErrorCode ec){
		this.code = ec.getCode();
		this.msg = ec.getMsg();
	}
	
	private Result(ErrorCode ec,String msg){
		this.code = ec.getCode();
		this.msg = msg;
	}
	
	public static Result getSuccessResult(String msg){
		Result result = new Result(ErrorCode.OK,msg);
		result.setSuccess(true);
		return result;
	}
	
	public static Result getFailResult(String msg){
		Result result = new Result(ErrorCode.ERROR,msg);
		result.setSuccess(false);
		return result;
	}
	
	public static Result fail(String msg){
		Result result = new Result(ErrorCode.ERROR,msg);
		result.setSuccess(false);
		return result;
	}
	
	public static Result getFailResult(String msg,Object obj){
		Result result = new Result(ErrorCode.ERROR,msg);
		result.setSuccess(false);
		result.setData(obj);
		return result;
	}
	
	public static Result getFailResult(ErrorCode code,String msg){
		Result result = new Result(code,msg);
		result.setSuccess(false);
		return result;
	}
	
	public static Result getSuccessResult(){
		Result result = new Result(ErrorCode.OK);
		result.setSuccess(true);
		return result;
	}
	
	public static Result getSuccessResult(Object obj){
		Result result = new Result(ErrorCode.OK);
		result.setSuccess(true);
		result.setData(obj);
		return result;
	}
	
	public static Result success(Object obj){
		Result result = new Result(ErrorCode.OK);
		result.setSuccess(true);
		result.setData(obj);
		return result;
	}
	
	public static Result success(String msg){
		Result result = new Result(ErrorCode.OK);
		result.setSuccess(true);
		result.setMsg(msg);
		return result;
	}
	
//	public static Result getFailResult(){
//		Result result = new Result(ErrorCode.ERROR);
//		result.setSuccess(false);
//		return result;
//	}
	
	public static Result getInstance(ErrorCode ec,String msg){
		return new Result(ec.getCode(),msg);
	}
	
	public static Result getInstance(ErrorCode ec){
		return new Result(ec);
	}
	
	public static Result getInstance(int code,String msg){
		return new Result(code,msg);
	}
	
}
