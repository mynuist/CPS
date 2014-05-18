/**
 * @(#) FtpAction.java 2013-3-5
 *
 * Copyright (C),2012-2014, SEI All Rights Reserved.
 * 
 */
package US.CPS.action.account;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.beans.factory.annotation.Autowired;

import US.CPS.entity.account.Account;
import US.CPS.entity.userinfo.Userinfo;
import US.CPS.service.IAccountService;

import com.opensymphony.xwork2.ActionSupport;


public class AccountAction extends ActionSupport implements ServletRequestAware {

	@Autowired
	private IAccountService accountService;

	private Account account;
	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	private Userinfo userinfo;
	private String name;

	
	private String success;
	private String msg;
	private HttpServletRequest servletRequest;

	public String register() {
		try{
		accountService.registerAccount(account, null);
		this.setSuccess("true");
		this.setMsg("ok");
		return SUCCESS;
		}
		catch(Exception e){
			System.out.println("error" + e.getMessage());
			e.printStackTrace();
		}
		finally{
			
			return SUCCESS;
		}
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSuccess() {
		return success;
	}



	public void setSuccess(String success) {
		this.success = success;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		servletRequest = arg0;
	}
	

}
