package com.tradeshow.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class SettingAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	public Map response;

	public Map getResponse() {
		return response;
	}

	public void setResponse(Map response) {
		this.response = response;
	}
	
	
}
