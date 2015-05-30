package com.struts2Login.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2Login.bean.User;
import com.struts2Login.service.LoginServeice;
import com.struts2Login.service.impl.LoginServiceImpl;

/**
 * Created by Super on 2015/5/28.
 */
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
    private String username;
    private String password;

    private LoginServeice loginServeice=new LoginServiceImpl();


    @Override
    public String execute() throws Exception {
        if(this.loginServeice.isLogin(username,password)){
            User user=new User();
            user.setUsername(username);
            user.setPassword(password);

            ActionContext.getContext().getSession().put("userInfo",user);
            return SUCCESS;
        }

        return INPUT;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
