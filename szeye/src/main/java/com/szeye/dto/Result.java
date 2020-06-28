package com.szeye.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Result {
	
	public int code;
	public String msg;
	public boolean success;
	public long total;
	public Object data;
	
	private Result(int code, String msg){
		this.code = code;
		this.msg = msg;
		this.success = true;
	}
	
	private Result(ErrorCode ec){
		this(ec.getCode(), ec.getMsg());		
	}
	
	public static Result success(String msg){
		return new Result(ErrorCode.OK.getCode(),msg);
	}
	
	public static Result success(Object obj){
		Result result = new Result(ErrorCode.OK);
		result.setData(obj);
		return result;
	}
	
	public static Result success(){
		return new Result(ErrorCode.OK.getCode(),"");
	}
	
	public static Result failure(String msg){
		Result r = new Result(ErrorCode.ERROR.getCode(),msg);
		r.setSuccess(false);
		return r;
	}
	
	public static Result getInstance(ErrorCode ec,String msg){
		return new Result(ec.getCode(),msg);
	}
	
}
