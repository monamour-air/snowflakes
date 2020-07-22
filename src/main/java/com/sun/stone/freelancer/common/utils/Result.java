package com.sun.stone.freelancer.common.utils;

/**
 * @author mac_sf
 * @since date: 2020 0722
 * 
 */
public class Result<T> {
	private String msg;
	private int code;
	private T data;

	private Result(T data) {
		this.code = 0;
		this.msg = "成功";
		this.data = data;
	}

	private Result(CodeMsg msg) {
		if (msg == null)
			return;
		this.code = msg.getCode();
		this.msg = msg.getMsg();
	}

	/**
	 * 成功时候的调用
	 * @return
	 */
	public static <T> Result<T> success(T data){
		return new Result<T>(data);
	}
	/**
	 * 成功，不需要传入参数
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> Result<T> success(){
		return (Result<T>) success("");
	}
	/**
	 * 失败时候的调用
	 * @return
	 */
	public static <T> Result<T> error(CodeMsg msg){
		return new Result<T>(msg);
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
