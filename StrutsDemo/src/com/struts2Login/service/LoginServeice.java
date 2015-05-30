package com.struts2Login.service;

/**
 * Created by Super on 2015/5/28.
 */
public interface LoginServeice {

    /**
     * ÑéÖ¤µÇÂ½
     * @param username
     * @param password
     * @return
     */
    public boolean isLogin(String username,String password);
}
