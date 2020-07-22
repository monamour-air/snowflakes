package com.sun.stone.freelancer.common.utils;

/**
 * @author mac_sf
 * @since 2020 0722
 * 返回消息封装
 */
public class CodeMsg {

	private int code;

	private String msg;
	// 通用异常
	public static final CodeMsg SUCCESS = new CodeMsg(0, "success");
	public static final CodeMsg SERVER_EXCEPTION = new CodeMsg(500100, "服务端异常");
	public static final CodeMsg PARAMETER_ISNULL = new CodeMsg(500101, "输入参数为空");
	// 业务异常
	public static final CodeMsg USER_NOT_EXSIST = new CodeMsg(500102, "用户不存在");
	public static final CodeMsg ONLINE_USER_OVER = new CodeMsg(500103, "在线用户数超出允许登录的最大用户限制。");
	public static final CodeMsg SESSION_NOT_EXSIST = new CodeMsg(500104, "不存在离线session数据");
	public static final CodeMsg NOT_FIND_DATA = new CodeMsg(500105, "查找不到对应数据");

	private CodeMsg() {
		super();
	}

	private CodeMsg(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
