package com.cskaoyan.Vo;

/**
 * Created by little Stone
 * Date 2019/6/27 Time 10:23
 */
public class PlanResponseVo<T> {

	int status;
	String message;
	T data;

	public PlanResponseVo() {
	}

	public PlanResponseVo(int status, String message, T data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
