package com.tradeshow.action;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	public Map response;

	public Map getResponse() {
		return response;
	}

	public void setResponse(Map response) {
		this.response = response;
	}
	
	public String userAdd(){
		boolean result = false;
		Map<String,String> map = new HashMap<String,String>();
		map.put("add", "success");
		this.setResponse(map);
		return SUCCESS;
	}
	
	public String userSearch(){
		boolean result = false;
		Map<String,String> map = new HashMap<String,String>();
		map.put("add", "success");
		this.setResponse(map);
		return SUCCESS;
	}
	
	public String userDel(){
		boolean result = false;
		HttpServletRequest req = ServletActionContext.getRequest();
		String userId = (String) req.getAttribute("userId");
		Map<String,String> map = new HashMap<String,String>();
		map.put("add", "success");
		this.setResponse(map);
		return SUCCESS;
	}
	
	public String userLogin(){
		boolean result = false;
		HttpServletRequest req = ServletActionContext.getRequest();
		String userName = (String) req.getParameter("name");
		String userPass = (String) req.getParameter("password");
		Map<String,String> map = new HashMap<String,String>();
		map.put("name", userName);
		map.put("userPass", userPass);
		this.setResponse(map);
		return SUCCESS;
	}
	
}
