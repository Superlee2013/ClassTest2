package com.struts2Login.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.struts2Login.bean.User;
import com.struts2Login.dao.WriteData;
import com.struts2Login.dao.impl.WriteDataImpl;

/**
 * Created by Super on 2015/5/28.
 * Ä£ÐÍÇý¶¯
 */
public class RegisterAction extends ActionSupport implements ModelDriven<User>{

    private User user=new User();

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        String filename="D:\\sql.txt";
        WriteData out=new WriteDataImpl();
        out.write(filename,user);
        return super.execute();
    }
}
