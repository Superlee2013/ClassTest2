package com.struts2Login.dao;

import com.struts2Login.bean.User;

/**
 * Created by Super on 2015/5/28.
 */
public interface WriteData {
    /**
     * ������д��һ��txt�ļ�
     * @param filename
     * @param user
     */
    public void write(String filename,User user);
}
